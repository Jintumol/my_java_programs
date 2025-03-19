import java.util.*;
public class words {
   public static void main(String[] args) {
    String sentence="hi hi hello";
    String[] words=sentence.split("\\s+");
    HashMap<String, Integer> wordcount= new HashMap<>();
    for(String word: words){
        word=word.toLowerCase();
        wordcount.put(word, wordcount.getOrDefault(word, 0)+1);

    } 
    wordcount.forEach((a,b)->{
    System.out.println(a+":"+b);
    });
    };
        
    
   } 

