import java.util.*;
public class ArraySum {
    public static int tSum(int arr[],int n){
        if(n==1)
        return arr[0];

      return arr[n-1] + tSum(arr, n-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("sum of elements = "+tSum(arr, n));
    }
}
