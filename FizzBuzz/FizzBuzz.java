import java.util.*;

class FizzBuzz {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<n;i++){
            if(i%5==0 && i%3==0){
                System.out.print("FizzBuzz"+" ");
            }else if(i%3==0){
                  System.out.print("Buzz"+" ");
            }else if(i%5==0){
                  System.out.print("Fizz"+" ");
            }else{
                 System.out.print(i+" ");
            }
        }
    }
    
}