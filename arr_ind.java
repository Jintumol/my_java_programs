import java.util.*;
public class arr_ind {
   public static void main(String[] args) {
    int arr[];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array size:");
    int arr_size=sc.nextInt();
    arr= new int[arr_size];
    int i;
    for(i=0;i<arr_size;i++){
        System.err.print("enter the "+i+"th element");
        arr[i]=sc.nextInt();
    }
    for(i=0;i<arr_size;i++){
        System.out.print(arr[i]+"\t");
    }
    
    System.out.println("Enter the element that needs to find");
    int b=sc.nextInt();
    for(i=0;i<arr_size;i++){
        if(b==arr[i]){
            System.out.println("index is"+i);
        }
    }

   } 
}
