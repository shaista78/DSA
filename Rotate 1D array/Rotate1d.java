import java.util.Scanner;
class Rotate1d{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int t = s.nextInt();
        while(t--!=0){
        int n = s.nextInt();
        int k = s.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++) arr[i]=s.nextInt();
        int res=k%n;
        while(res>0){
            int temp =arr[n-1];
            for(int i=n-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            res--;
            arr[0]=temp;
            }
            
        
         for(int i=0;i<n;i++) 
         {
             System.out.print(arr[i]+" ");
         }
         System.out.println();
        }
    }
}