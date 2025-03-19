import java.util.*;
public class arr1 {
    public static void main(String[] args) {
        int arr[] ={2,7,11,15};
        int target[]= new int[2];
        int i,j;
        int x=0;
        for(i=0;i<4;i++){
            target[0]=i;
            for(j=0;j<4;j++){
             if(i==j){
                
             }
             else{
                
                if(arr[i]+arr[j]==9){
                    
                    target[1]=j;
            
                    System.out.println(i+"\t"+j);
                    x=1;
                    break;
                    
                }
             }
            }
            if(x==1){
                break;
            }
        }
    } 
}          