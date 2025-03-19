import java.util.*;
public class sorting {
    public static void main(String[] args) {
        int arr[]={3,6,2,9,5,1};
        int arr1[]= new int[6];
        int i,j,k=0;
        int first=0,last=arr.length-1;
        int flag=0;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.err.println(" ");
        while(first<=last){
           if(flag==0){
            arr1[k]=arr[first];
            first++;
            flag=1;
           }
            else{
            
            arr1[k]=arr[last];
            last--;
            flag=0;          
        }
        k++;
        }
        
        
        for(k=0;k<arr1.length;k++){
            System.out.print(arr1[k]+" ");

    }
}
}
