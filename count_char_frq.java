import java.util.*;
public class count_char_frq {
    public static void main(String[] args) {
        String sentence= "hi hello";
        LinkedHashMap<Character, Integer> frequency = new LinkedHashMap<>();
        int a=sentence.length();
        System.out.println(a);
        int i;
        for(i=0;i<a;i++){
            System.out.println(sentence.charAt(i));
        }
        for(i=0;i<a;i++){
            char ch = sentence.charAt(i);
            if(ch!=' '){
        frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
            }
        }
        for(Map.Entry<Character, Integer> count: frequency.entrySet()){
            System.out.println(count.getKey()+":"+ count.getValue());
        }
    }
}
