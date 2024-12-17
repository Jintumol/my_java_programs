import java.util.*;
public class largest_of_3_numbers {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if(a>b && a>c){
        System.err.println(a+" is largest");
    }
    else if(b>a && b>c){
        System.err.println(b+" is largest");
    }
    else{
        System.err.println(c+" is largest");
    }
}    
}
