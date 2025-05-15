public class Queue {
    int queue[]= new int[5];
    int size;
    int front;
    int rear;

void enqueue(int a){
    if(!full()){
    queue[rear]=a;
    rear = (rear+1)%5;
    size++;
    }else{
        System.out.println("queue is full");
    }
}
int dequeue(){
    if(!empty()){
   int a= queue[front];
   front = (front+1)%5;
   size--;
   return a; 
    }else{
        System.out.println("queue is empty");
        return 0;
    }
}
void show(){
    for(int i=0;i<size;i++){
        System.out.print(queue[(front+i)%5]+" ");
    }
}
 
int getsize(){
    return size;
}

boolean empty(){
    return size==0;
}

boolean full(){
    return size==5;
}
public static void main(String[] args) {
    Queue q= new Queue();
    q.enqueue(3);
    q.enqueue(5);
    q.enqueue(6);
    q.enqueue(8);
    q.enqueue(10);
    System.out.println(q.full());
    q.enqueue(50);
    q.show();
    q.dequeue();
    q.dequeue();
    System.out.println();
    q.show();
    System.out.println();
    q.enqueue(30);
    q.show();
    System.out.println();
    System.out.println("size :"+q.getsize());
    System.out.println();
    System.out.println(q.empty());
}
}
