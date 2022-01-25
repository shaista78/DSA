
import java.util.Scanner;
class Zero12{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int te = s.nextInt();
        while(te--!=0){
            int n = s.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<n;i++){
                arr[i]= s.nextInt();
            }
            int i=0;
            int j=n-1;
            int mid=0;
            while(mid<=j){
                if(arr[mid]==0){
                    int t=arr[mid];
                    arr[mid]=arr[i];
                    arr[i]=t;
                    mid++;
                    i++;
                }
                else if(arr[mid]==2){
                     int t=arr[mid];
                    arr[mid]=arr[j];
                    arr[j]=t;
                  j--;
                }
                else if(arr[mid]==1){
                    mid++;
                }
            }
            for(int k=0;k<n;k++) System.out.print(arr[k]+" ");
            System.out.println();
        }
    }
}