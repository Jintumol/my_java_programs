import java.util.*;
public class repeat {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,5,5};
        int i,j,x=0;
        for(i=0;i<arr.length;i++){
            int temp=i,count=0;
            for(j=0;j<arr.length;j++){
                if(temp==arr[j]){
        
                    count=count+1;

                }else{}
                if(count>1){
                    System.out.println(temp);
                    x=1;
                    break;
                }
            }
            if(x==1){
                break;
            }
            
        }
    }
}
