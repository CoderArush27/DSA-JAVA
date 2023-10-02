public class Searching {
    // O[N]
    boolean linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
    //O[log n]
    boolean binarySearch(int arr[],int key){
        int si = 0;
        int ei = arr.length-1;

        while(si<ei){
            int mid = (si+ei)/2;
            if(key==arr[mid]){
                return true;
            }
            else if(arr[mid]>key){
                ei = mid-1;
            }
            else{
                si = mid+1;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int arr[]={1,6,9,71,5,9,1515,58,15,26};
        int arr1[]={1,2,3,3,6,7,8,9,10};
        Searching s = new Searching();
        System.out.println(s.linearSearch(arr, 1515));
        System.out.println(s.binarySearch(arr1, 6));
    }
}
