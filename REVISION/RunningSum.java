public class RunningSum {
    public static void runSum(int arr[]){
        int sum[]=new int[arr.length];
        sum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            sum[i]=sum[i-1]+arr[i];
        }
        for(int x:sum){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,15,20,25,30};
        runSum(arr);
    }
}