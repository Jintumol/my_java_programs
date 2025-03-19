import java.util.*;
public class array_odd_even {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a;
        System.out.println("Enter the size of array:");
        a=sc.nextInt();
        int arr[] = new int[a];
        int i=0; 
        int e=0;
        int o=0;
        for(i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<a;i++){
            System.out.print(arr[i]+"\t"); 
        }
        for(i=0;i<a;i++){
            if(arr[i]%2==0){
                e=e+1;
            }
            else{
                o=o+1;
            }
        }
        System.out.println("Even:"+e);
        System.out.println("Odd:"+o);
    }
    
}
