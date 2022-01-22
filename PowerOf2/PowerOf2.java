
import java.util.Scanner;
class PowerOf2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count=0;
        while(n>0){
            if(n%2==1) count++;
            n=n/2; 
        }
        if(count==1){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}