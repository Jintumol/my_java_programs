import java.util.*;
public class arr_2ndlarg {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,4};
        int i;
        for(i=0;i<4;i++){
            if(arr[i]<arr[i+1]){
                arr[i+1]=arr[i];
            }
        }
        System.out.println(arr[i+1]);
    }
    
}
