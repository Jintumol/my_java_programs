import java.util.*;
public class arr4 {
   public static void main(String[] args) {
    int arr1[]= {1,3,5};
    int arr2[]={2,4,6};
    int arr3[]= new int[6];
    int i=0,j=0,k=0;
    while(i<3 && j<3){
        if(arr1[i]<arr2[j]){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        else{
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        
    }
    while(i<3){
        arr3[k]=arr1[i];
            i++;
            k++;
    }
    while(j<3){
        arr3[k]=arr2[j];
            j++;
            k++;
    }
    for(k=0;k<6;k++){
    System.out.print(arr3[k]+"\t");
    }
   } 
}
