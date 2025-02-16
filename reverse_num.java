import java.util.*;
public class reverse_num {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n,rev=0;
    System.out.print("Enter the number");
    n=sc.nextInt();
    while(n!=0){
     rev=rev*10;
     rev=rev+ n%10;
     n=n/10;
    }
    System.out.println("Reverse:"+ rev);
   } 
}
