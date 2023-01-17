public class MaxSubarrayBrute {
    public static int maxSum(int arr[]){
        int mSum = Integer.MIN_VALUE;
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum = sum+arr[k];
                }
                if(sum>mSum)
                mSum = sum;
            } 
        }
        return mSum;
    }
    public static void main(String[] args) {
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSum(arr));
    }
}
