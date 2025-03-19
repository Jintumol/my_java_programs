import java.util.*;
public class arr2 {
    public static void main(String[] args) {
        int a=3456;
        int arr[]= new int[4];
        int b=3456+1;
        int i=3;
        while(b>0){
            arr[i]= b%10;
            b=b/10;
            i--;

        }
        for(i=0;i<4;i++){
            System.out.print(arr[i]+"\t");
        }
        

    }
}
