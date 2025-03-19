import java.util.*;
public class hashmap1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,4,5,7,6};
        HashMap<Integer, Integer> repeat= new HashMap<>();
        int i;
        for(i=0;i<arr.length;i++){
            int num=arr[i];
            if(repeat.containsKey(num)){
            System.out.println(num);
            break;
            }
            else{
                repeat.put(num,0);
            }
        }
    }
}
