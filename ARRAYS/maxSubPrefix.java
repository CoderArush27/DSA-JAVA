import java.util.*;
public class maxSubPrefix {
    public static void maxSubPre(int arr[]){
        int p[] = new int[arr.length]; //array of prefix sums
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        p[0] = arr[0];
        for(int i=1;i<p.length;i++){
            p[i]=p[i-1]+arr[i];
        }
        
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
            sum =(i==0)?p[j]: p[j]-p[i-1];
            if(sum>maxSum){
            maxSum=sum;
        }
    }
}
        System.out.println("MAXIMUM SUBARRAY SUM = "+maxSum);
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
        maxSubPre(arr);
    }
}
