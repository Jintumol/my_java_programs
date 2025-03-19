import java.util.*;
public class add2list {
    public static void main(String[] args) {
       int arr[]={1,2,3};
       int arr1[]={1,3,5};
       int arr2[]= new int[6];
       int i=0,j=0,k=0;
       while(i<3 && j<3){
        if(arr[i]<arr1[j]){
            arr2[k]=arr[i];
            i++;
            k++;
        }
        else{
            arr2[k]=arr1[j];
            j++;
            k++;
        }
       }
       while(i<3){
        arr2[k]=arr[i];
        i++;
        k++;
       }
       while(j<3){
        arr2[k]=arr1[j];
        j++;
        k++;
    }
    for(k=0;k<6;k++){
        System.out.print(arr2[k]+"\t");
    }
}
}
