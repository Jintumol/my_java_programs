import java.util.*;
public class star{
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        int i;
        int j;
        System.out.println("Enter a number");
        a=sc.nextInt();
        for(i=0; i<=a; i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}