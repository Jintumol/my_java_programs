import java.util.*;
public class arr {
    public static void main(String[] args) {
    
        int arr[]= new int[4];
        int a=3450;
        int i=0;
        while(a>0){
            arr[i]=a%10;
            a=a/10;
            i++;
        }
        for(i=0;i<4;i++){
            System.err.print(arr[i]+"\t");
        }
    }
}
