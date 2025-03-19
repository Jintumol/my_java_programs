import java.util.*;
public class arr5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int arr[]={1,2,3,4,5,6};
        System.out.print("Enter 1st index:");
        int a= sc.nextInt();
        System.out.print("Enter last index:");
        int b= sc.nextInt();
        int i,sum=0;
        for(i=a;i<=b;i++){
          sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
