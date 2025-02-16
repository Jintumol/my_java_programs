import java.util.*;
public class factorial {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,i,fact=1;
    System.out.println("Enter the number:");
    a=sc.nextInt();
    for(i=1; i<=a; i++){
        fact=fact*i;
        

    }
    System.out.println(fact);
   } 
}
