import java.util.*;
public class arr_jump {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int a=0;
        int i=0;
        int x=0;
        for(i=0;i<4;i++){
          a=a+arr[i];

        if(a>=3){
            System.out.println("sucess");
            x=1;
            break;
        }
        
       }
       if(x!=1){
       System.out.println("failed");
       }

    }
}
