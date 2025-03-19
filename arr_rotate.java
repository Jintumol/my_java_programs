import java.util.*;
public class arr_rotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int i=0,j=0;
        while(j<2){
        int temp=arr[0];
        
        for(i=0;i<3;i++){
            arr[i]=arr[i+1];
        }
        arr[i]=temp;
        j++;

        }
        for(i=0;i<4;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
