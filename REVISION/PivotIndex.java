public class PivotIndex {
    public static int pivot(int arr[]){
        int n=arr.length;
        if(n==0){
            return -1;
        }
        int right[]=new int[n];
        int left[]=new int[n];
        left[0]=arr[0];
        right[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            left[i]=left[i-1]+arr[i];
            right[n-1-i]=right[n-i]+arr[n-i-1];
        }

        for(int i=0;i<n;i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,1,-1};
        System.out.println(pivot(arr));
    }
}
