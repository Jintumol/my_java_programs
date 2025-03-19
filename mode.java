import java.util.*;
public class mode {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,3,3,3,5,6,6};
        int a=arr.length;
        int i;
        HashMap<Integer, Integer> number=new HashMap<>();
        for(i=0;i<a;i++){
            int num=arr[i];
            number.put(num, number.getOrDefault(num, 0)+1);
        }
        int max=0,entry=0;
        for(Map.Entry<Integer, Integer> frequency:number.entrySet()){
        
            if(max<frequency.getValue()){
                max=frequency.getValue();
                entry=frequency.getKey();
                
            }
        }
        System.out.println(entry);
    }
}
