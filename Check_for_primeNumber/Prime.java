import java.util.Scanner;
 
 public class Prime {
    public static boolean Prime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    
    
     public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    if(Prime(n)){
        System.out.print("Yes");
    }else{
         System.out.print("No");
    }
     }
}
