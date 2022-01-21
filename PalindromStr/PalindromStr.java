import java.util.Scanner;
class PalindromStr{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();
        int i=0,j=str.length()-1;
        int count=0;
        while(i!=j){
            if(str.charAt(i)==str.charAt(j)){
                count++;
            }
            i++;
            j--;
        }
      if(count==str.length()/2){
          System.out.println("yes");
      }else{
          System.out.println("no");
      }

    }
}