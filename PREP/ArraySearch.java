
import java.util.*;
public class ArraySearch {
    public int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[],int key){
        int si = 0;
        int ei = arr.length-1;
        while(si<=ei){
            int mid = (si+ei)/2;
            if(arr[mid]==key)
                return mid;

            else if(arr[mid]>key)
                 ei = mid-1;
            else
                si = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        ArraySearch a = new ArraySearch();
        Scanner s = new Scanner(System.in);
        int arr[]={8,6,2,1,3,4};
        int key = s.nextInt();
        int arr1[]={1,2,3,4,5,6};
        int key1 = s.nextInt();
        int index = a.linearSearch(arr, key);
        int index1 = a.binarySearch(arr1, key1);
        System.out.println("key is found at index linear = "+index);
        System.out.println("key is found at index binary = "+index1);
    }
}
