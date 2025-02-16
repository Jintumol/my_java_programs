import java.util.Scanner;
public class frequency {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char s;
        String a="abaaacccbbc";
    // System.out.println(a.charAt(0));
       System.out.println("Enter the string:");
        s=sc.next().charAt(0);
        int i=0;
        int d=0;
        for(i=0;i<a.length();i++){
            System.out.println(a.charAt(i));
            if(a.charAt(i)==s){
              d++;
            }
        }
        System.out.println(d);
    }
}