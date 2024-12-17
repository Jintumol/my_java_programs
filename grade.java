import java.util.*;
public class grade {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a;
    a=sc.nextInt();
    if(a>=90 && a<=100){
        System.err.println("A");
    }
    else if(a>=80 && a<=89){
        System.err.println("B");
    }
    else if(a>=70 && a<=79){
        System.err.println("C");
    }
    else if(a<70){
    System.err.println("Fail");
    }
    else{
        System.err.println("Error");
    }
 }   
}
