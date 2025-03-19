import java.util.*;
public class arr_freq {
  public static void main(String[] args) {
    int arr[]={1,2,2,1,3};
    int arr1[]=new int[arr.length];
    int i,j;
    for(i=0;i<arr.length;i++){
        int temp,count=0;
        temp=arr[i];
        for(j=0;j<arr.length;j++){
            if(temp==arr[j]){
             count++;
            
            }
    }
    arr1[i]=count;
    
    }
    for(i=0;i<arr.length;i++){
        System.out.print(arr1[i]+"\t");
  }  
}
}
