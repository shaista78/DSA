import java.util.Scanner;
class BubblrSort {
    public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	//This function implements bubble sort.
	public static int[] bubbleSort(int[] arr,int n){
		for (int i=0;i<n;i++){
			int count = 0;
			for (int j=0;j<n-i-1;j++){
				if (arr[j] > arr[j+1]){
					swap(arr,j,j+1);
					count++;
				}
			}
			if (count == 0){
				return arr;	
			}
		}
		return arr;	
	}
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=s.nextInt();
        bubbleSort(arr,n);
		for (Integer i : arr) System.out.print(i + " ");

    }
}