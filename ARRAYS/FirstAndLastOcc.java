
public class FirstAndLastOcc {
    public static int firstOcc(int arr[],int key){
        int si = 0;
        int ei = arr.length-1;
        int ans = -1;
        while(si<=ei){
            int mid = (si+ei)/2;
            if(arr[mid]==key){
                ans = mid;
                ei = mid-1;
            }
            else if(arr[mid]>key)
                ei=mid-1;
            else
                si = mid+1;
        }
        return ans;
    }
    public static int lastOcc(int arr[],int key){
        int si = 0;
        int ei = arr.length-1;
        int ans = -1;
        while(si<=ei){
            int mid = (si+ei)/2;
            if(arr[mid]==key){
                ans = mid;
                si = mid+1;
            }
            else if(arr[mid]>key)
                ei=mid-1;
            else
                si = mid+1;
        }
        return ans;
    }
   
    public static void firstAndLast(int arr[],int key){
        int first = firstOcc(arr, key);
        int last = lastOcc(arr, key);

        System.out.println("first "+first);
        System.out.println("last "+last);
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,3,6,7,7,9};
        firstAndLast(arr,3);
    }
}
