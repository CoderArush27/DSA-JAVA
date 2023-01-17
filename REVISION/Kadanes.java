public class Kadanes {
    public static int subSum(int nums[]){
        int sum=0;
        int Msum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];

            if(sum>Msum){
                Msum=sum;
            }
            if(sum<0)
                sum=0;
            
            // else
            // Msum = Math.max(Msum,sum);
        }
        return Msum;
    }
    public static void main(String[] args) {
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("MAXIMUM SUBARRAY SUM = "+subSum(arr));
    }
}
