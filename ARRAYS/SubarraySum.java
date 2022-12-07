public class SubarraySum {
    public static int sum(int nums[],int k){
        int count=0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={3,1,2,4,5,1};
        System.out.println(sum(arr,6));
    }
}
