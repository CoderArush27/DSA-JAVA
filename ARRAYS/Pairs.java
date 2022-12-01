import java.util.*;
public class Pairs {
    public static void pair(int arr[]){
        for(int i=0;i<=arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
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
        pair(arr);
    }
}
