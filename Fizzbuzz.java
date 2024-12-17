public class Fizzbuzz {
    public static void main(String[] args){
    int i=1;
    while(i<=100){
        if(i%3==0 && i%5==0){
        System.err.println("FizzBuzz");
        }else if(i%3==0){
            System.err.println("Fizz");
        }
        else if(i%5==0){
            System.err.println("Buzz");
        }
        else{
            System.out.println(i);
        }
        i++;
    }
}
}
