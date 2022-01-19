
import java.util.Scanner;
public class Binary2Num {
    public static int[] stringArray(String str){
        int arr[]=new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i] = Integer.parseInt(Character.toString(str.charAt(i)));
        }
        return arr;
    }
    static int BinaryToNum(int arr[]){
        int value=0;
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==1){
                value+= (int)(Math.pow(2,j));
            }
            j++;
        }
        return value;
    }
    public static void main(String[] args){
         String str = "00000000000000000000000000000111";
         int arr[] = stringArray(str);
         int value = BinaryToNum(arr);
         System.out.println(value);
    }

}
