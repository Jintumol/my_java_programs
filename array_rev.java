import java.util.*;
public class array_rev {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.println("Enter the size of array:");
        a=sc.nextInt();
        int arr[] = new int[a];
        int i=0; 
        for(i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(i=a-1;i>=0;i--){
            System.out.print(arr[i]+"\t"); 
        }
    }    
}
