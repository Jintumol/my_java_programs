import java.util.*;
public class mean {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int a= arr.length;
        double d=(double)a;
        int i,sum=0;
        for(i=0;i<a;i++){
          sum=sum+arr[i];
        
        }
        double s= sum/d;
        System.out.print("Mean="+s);
    }
}
