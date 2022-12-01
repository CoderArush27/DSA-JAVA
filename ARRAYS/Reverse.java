import java.util.*;
public class Reverse {
    public static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void rev(int arr[]){
        int l = arr.length-1;
        int f = 0;
        while(f<l){
            int temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;
            f++;
            l--;
        }
    }
    //we can reverse the array using two methods either by taking an extra array or by swapping
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF AN ARRAY");
        int n = s.nextInt();
        int []arr = new int[n];
        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        rev(arr);
        print(arr);
    }
}
