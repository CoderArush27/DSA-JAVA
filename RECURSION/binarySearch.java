public class binarySearch {
    public static boolean binary(int arr[],int key,int size,int si,int ei){
     if(size==0)
        return false;

    int mid = (si + ei)/2;

    if(si>ei)
        return false;
    
    if(arr[mid]==key)
        return true;
    
    if(arr[mid]>key){
        ei = mid-1;
        return binary(arr, key, size, si, ei);
    }
    else{
        si = mid+1;
        return binary(arr, key, size, si, ei);
    }
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int key = 25;
        int n = 5;
        System.out.println(binary(arr, key, n, 0, n-1));
    }
}
