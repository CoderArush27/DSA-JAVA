
import java.util.*;
public class BinarySearch {
    public static int Bin(int arr[],int key){
        int f=0;
        int l=arr.length;
        while(f<=l){
            int mid = (f+l)/2;
            if(arr[mid]==key)
                return mid;
            
            if(arr[mid]>key)
                l=mid-1;
            else 
                f=mid+1;
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
        System.out.println("Index for key= "+Bin(arr, key));
    }
}
