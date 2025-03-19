import java.util.*;
public class arr3 {
  public static void main(String[] args) {
    int arr[]={1,2,3};
    int i=0,j=2,a=0,temp=0;
    
    while(a<3){
        if(i!=1 && j!=1){
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        a++;
        }
        else{
            break;
        }
        
    }
    System.out.println(arr[2]);
    
    }
    }
  
