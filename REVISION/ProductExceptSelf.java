public class ProductExceptSelf {
    public static int[] product(int arr[]){
        int n = arr.length;
        if(n<1){
            return arr;
        }
        int ans[]=new int[n];
        ans[0]= arr[0];
        for(int i=1;i<n-1;i++){
            ans[i]=ans[i-1]*arr[i];
        }
        int p = 1;
        for(int i=n-1;i>0;i--){
            ans[i]=p*ans[i-1];
            p = p*arr[i];
        }
        ans[0]=p;

    return ans;
    }
    public static void main(String[] args) {
        int arr[]={-1,1,0,-3,3};
        int an[]= product(arr);
        for(int x:an){
            System.out.print(x+" ");
        }
    }
}
