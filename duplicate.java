import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,3,5,6,6};
        int a=arr.length;
        int i;
        HashMap<Integer, Integer> number=new HashMap<>();
        for(i=0;i<a;i++){
            int num=arr[i];
            number.put(num, number.getOrDefault(num, 0)+1);
        }
        System.out.println("Duplicate elements and their frequency");
        for(Map.Entry<Integer, Integer> duplicate: number.entrySet()){
            if(duplicate.getValue()>1){
              System.out.println(duplicate.getKey()+":"+ duplicate.getValue());
            }
        }
    }
}
