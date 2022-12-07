import java.util.*;

public class maxSubarray {
    public static void subSum(int arr[]){
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                sum = sum + arr[k];
            }
            if(sum > maxSum){
                maxSum = sum;
            }
            System.out.print(sum+" ");
        } 
        }
        System.out.println();
        System.out.println("MAXIMUM SUBARRAY SUM = "+maxSum);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER SIZE");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("ENTER ELEMENTS");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        subSum(arr);
    }
}
