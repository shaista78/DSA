

 class Anagarm{
    public static void main(String[] args){
        int n = 4;
       String str1 = "abdc";
       int m =4;
       String str2 ="dcak";
        char arr[] =str1.toCharArray();
        char temp;
        int i=0;
        while(i<arr.length-1){
            int j =i+1;
            while(j<=arr.length-1){
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j=j+1;
            }
            i=i+1;
        }
        char arr1[] =str2.toCharArray();
        int k=0;
        while(k<arr1.length-1){
            int l =k+1;
            while(l<=arr1.length-1){
                if(arr1[l]<arr1[k]){
                    temp=arr1[k];
                    arr1[k]=arr1[l];
                    arr1[l]=temp;
                }
                l+=1;
            }
            k=k+1;
        }
      //  System.out.println(arr1);
        int count=0;
    for(int v=0;v<n;v++){
        if(arr[v]==arr1[v]){
            count++;
        }
    }
    if(count==n){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
    }
}