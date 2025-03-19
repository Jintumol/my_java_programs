import java.util.*;
public class array_sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.println("Enter the size of array:");
        a=sc.nextInt();
        int arr[] = new int[a];
        int i=0;
        int k=0;
        while(i<a){
            arr[i]=sc.nextInt();
            i++;
        }
        for(i=0;i<a;i++){
            System.out.print(arr[i]+"\t"); 
            k=k+arr[i];
        }   
        
        System.out.println("sum :"+k);

    }
}
