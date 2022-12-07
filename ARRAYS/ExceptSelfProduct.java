public class ExceptSelfProduct {
    public static int[] product(int nums[]){
        int p=1;
        int n = nums.length;
        int ans[] = new int[n];

        for(int i=0;i<n;i++){
            ans[i]=p;
            p = p*nums[i];
        }
        p=1;
        for(int i=n-1;i>=0;i--){
            ans[i] = ans[i]*p;
            p = p*nums[i];
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
       int ans[]=product(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(ans[i]+" ");
        }
    }
}
