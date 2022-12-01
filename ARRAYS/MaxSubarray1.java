import java.util.*;
public class MaxSubarray1 {
    public static void maxSub(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int curSum=0;
                for(int k=start;k<=end;k++){
                    curSum += arr[k];
                }
                if(curSum>maxSum){
                    maxSum=curSum;
                }
            }
        }
        System.out.println("maximum subarray sum = "+maxSum);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("ENTER THE SIZE OF AN ARRAY");
        int n = s.nextInt();

        int []arr = new int[n];

        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        maxSub(arr);
    }
}
