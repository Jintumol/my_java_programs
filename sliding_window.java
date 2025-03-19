import java.util.*;
public class sliding_window {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5};
        int i,j=0,sum=0;
        for(i=0;i<4;i++){
            Set<Integer> uniqueElements=new HashSet<>();
            int a=0;
            for(j=i;j<i+3;j++){
                uniqueElements.add(arr[j]); 
               a=a+arr[j];
                
            }
            if(uniqueElements.size()==3){
                if(sum<a){
                sum=a;
                }
            }
        }
        System.out.println(sum);
    }
}
