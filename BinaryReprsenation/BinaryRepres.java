import java.util.Scanner;
public class BinaryRepres {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = "";
        while(n>0){
            int t = n%2;
            str=t+str;
            n=n/2;
        }
        System.out.println(str);
    }
}
