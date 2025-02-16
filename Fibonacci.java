import java.util.*;
public class Fibonacci{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int a,i;
      int first=0;
      int second=1;
      System.out.println("Enter the number:");
      a=sc.nextInt();

      for(i=0;i<=a;i++){
       System.out.print(first+ "\t");
       int next=first+second;
       first=second;
       second= next;
      }

      
}
}