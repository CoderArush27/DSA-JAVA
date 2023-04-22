public class isSorted {
    public static boolean isSortedArr(int arr[],int n){
        if(n==0 || n==1)
            return true;
        if(arr[n-1]<arr[n-2])
            return false;
        
        return isSortedArr(arr, n-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6,4,5};
        int n = arr.length;
        System.out.println(isSortedArr(arr, n));
    }
}
