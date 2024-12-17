import java.util.*;
public class leapyear {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a;
    System.err.println("Enter a year:");
    a= sc.nextInt();
    if((a%4==0 && a%100!=0) || a%400==0){
        
            System.err.println(a+" is a leap year");
    }
    else{
        System.err.println(a+" is not a leap year");
    }
}
    
}
