public class PeakElement {
    public static int PeakEleIdx(int arr[]){
        //linear search se to seedhe maximum element pr O(n);
        //binary search se to O(logn)
        int si = 0;
        int ei = arr.length-1;
        while(si<ei){
            int mid = (si+ei)/2;
        if(arr[mid]<arr[mid+1]){
            si = mid+1;
        }
        else{
            ei = mid;
        }
    }
    return si;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,4,3,2,1};
        int n = PeakEleIdx(arr);
        System.out.println("peak element is "+arr[n]+" which is index "+n);
    }
}
