
import static java.lang.Math.abs;
import java.util.Scanner;
import java.util.Arrays;
class Cloestst{
	public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
      	int t = input.nextInt();
      	for(int k=0;k<t;k++)
        {
          int size = input.nextInt();
          int tar = input.nextInt();
          int[] arr = new int[size];
          for(int i=0;i<size;i++)
          {
          	arr[i] = input.nextInt();
          }
          Arrays.sort(arr);
          int diff = -3000;
        //  System.out.println(diff);
        if(size>=3){
          for(int i=0;i<size-2;i++)
          {
          int p1 = i+1;
          int p2 = size-1;
          while(p1<p2)
          {
           int val = arr[p1]+arr[p2]+arr[i];
            if(abs(tar-val)<=abs(tar-diff))
            {
            	diff=val;
            }
            if(val>tar)
            {
            	p2--;
            }
            else 
            {
            	p1++;
            }
          }
          }
           System.out.println(diff);
        }else{
            System.out.println(0);
        }
        
    }
}
}