import java.util.*;
public class LinearSearch {
    public static int linSer(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                return 1;
        }
        return -1;
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
        System.out.println("ENTER THE KEY");
        int key = s.nextInt();
        System.out.println(linSer(arr, key));
    }
}
