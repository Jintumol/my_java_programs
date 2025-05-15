public class Stack {
 public int stack[];
 public int top=-1;
 
 public Stack(){
    stack=new int[5];
 }
 void push(int a){
    if(top>=4){
        System.out.println("stack overflow");
    }else{
    top++;
    stack[top]=a;
    }
 }

 int pop(){
    if(top<=-1){
        System.out.println("stack is empty");
        return -1;
    }
    int a = stack[top];
    stack[top]=0;
    top--;
    return a;
 }
 void show(){
    for(int n : stack){
        System.out.print(n+ " ");
    }
 }

 int peek(){
    int a= stack[top];
    return a;
 }

 int size(){
    return top+1;
 }

 boolean empty(){
    return top<=-1;
 }

public static void main(String[] args){
Stack s= new Stack();
s.push(10);
s.push(15);
s.push(20);
s.push(30);
s.push(40);
s.push(50);
System.out.println(s.peek());
System.out.println();
System.out.println(s.empty());
s.show();
System.out.println();
System.out.println("size: "+ s.size());

System.out.println();
System.out.print(s.pop());
System.out.println();
s.show();
System.out.println();

System.out.println(s.peek());
System.out.println();

System.out.println("size: "+ s.size());
s.pop();
s.pop();
s.show();
System.out.println();
System.out.println(s.empty());
s.pop();
s.pop();
s.show();
System.out.println();
s.pop();
}

}