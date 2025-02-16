import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr= new int[5];
        int i=0;
        System.out.println("Enter 5 numbers:");
        for(i=0;i<5;i++){
            arr[i]= sc.nextInt();
        }
        for(i=0;i<5;i++){
        System.out.print(arr[i]+"\t");
        }
    }
}