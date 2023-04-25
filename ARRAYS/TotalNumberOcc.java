public class TotalNumberOcc {
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
    public static int totalOcc(int arr[],int key){
        //linear search O(N)
        //Binary Search O(logN)
        //steps;last occurance - first occurance + 1
        int f = firstOcc(arr, key);
        int l = lastOcc(arr, key);
        
        return l-f+1;
        }
    
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,3,3,3,3,3,5};
        System.out.println(totalOcc(arr, 3));
    }
}
