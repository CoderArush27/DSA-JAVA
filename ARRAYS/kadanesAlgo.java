import java.util.*;
public class kadanesAlgo {
    public static void subSum(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs += arr[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("MAXIMUM SUBARRAY SUM = "+ms);
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
    subSum(arr);
}

}