public class SubarraySumK {
    public static int sumK(int arr[],int dSum){
        int sum=0;
        int n =arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            sum = 0;
            for(int j=i;j<n;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum = sum + arr[k];
                }
                    if(sum == dSum)
                        count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int dSum = 3;
        System.out.println(sumK(arr, dSum));
    }
}
