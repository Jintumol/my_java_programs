import java.util.Scanner;

public class Sample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, i, j;
        System.out.println("Enter a number");
        a = sc.nextInt();
        for (i = 0; i < a; i++) {  // Change i <= a to i < a for correct pattern
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    }