import java.util.*;
public class swap {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,b,temp;
    System.out.println("Enter value of a and b");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("Before Swapping: a="+a+"\t"+"b="+b);
    temp=a;
    a=b;
    b=temp;
    System.out.print("After swapping: a="+a+"\t"+ "b="+b);
   } 
}
