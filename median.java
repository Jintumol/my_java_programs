// it is not actually median. for mediaan we have to do sorting
import java.util.*;
public class median {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int a= arr.length;
        if(a%2!=0){
            int b=a/2;
            System.out.println("Median="+arr[b]);
            
        }
        else if(a%2==0){
            int c=a/2;
            double d=(arr[c]+arr[c-1])/2.0;
            System.out.println("Median="+d);
        }
    }
}
