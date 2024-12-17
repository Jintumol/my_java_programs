import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        System.err.println("Enter a number");
        int i;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        if(i==1){
            System.err.println(i+" is neither");
        }
        else{
        if(i%2==0){
            System.err.println(i+" is an even number");
        }
        else{
            System.err.println(i+" is an odd number");
        }
    }


    }
}
