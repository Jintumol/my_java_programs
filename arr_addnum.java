import java.util.*;
public class arr_addnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4};
        int arr1[]=new int[arr.length+1];
        int i,temp;
        System.out.println("enter the number");
        int num=sc.nextInt();
        System.out.println("Enter the position");
        int p=sc.nextInt();
        for(i=0;i<p;i++){
            arr1[i]=arr[i];
        }
        arr1[p]=num;
        for(i=p;i<arr.length;i++){
            arr1[i+1]=arr[i];
        }
        for(i=0;i<arr.length+1;i++){
        
            System.out.print(arr1[i]+"\t");
        }
    }
}
