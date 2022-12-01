
import java.util.*;
public class basicArray {
    public static void incre(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }
    public static void print(int arr[]){
        for(int i:arr){
            System.out.println(i);
        }
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
        incre(arr);
        print(arr);
    }
}
