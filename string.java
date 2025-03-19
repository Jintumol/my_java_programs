import java.util.*;
public class string {
    public static void main(String[] args) {
        String str="jintu";
        int a=str.length();
        int i;
        String rev="";
        for(i=a-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);

    }
}
