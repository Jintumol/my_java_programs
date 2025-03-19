import java.util.*;
public class arr_remove {
    public static void main(String[] args) {
        int arr[]={3,2,2,3};
        int arr1[];
        arr1= new int[4];
        int a=0;
        int i,j=0;
        for(i=0;i<4;i++){
            if(arr[i]==3){
                a=a+1;
            }
            else{
        
            arr1[j]= arr[i];
             j=j+1;
            }
        
        }
        System.out.println(a);
        
        for(j=0;j<4;j++){
            System.out.print(arr1[j]+"\t");
                
            }
            
        
        
        
    }
}

