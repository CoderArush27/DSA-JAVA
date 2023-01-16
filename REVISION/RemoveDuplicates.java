//removing duplicates form a sorted array
public class RemoveDuplicates {
    public static int duplicates(int arr[]){
        int n=arr.length;
        if(n==0)
            return 0;
        int i=0;
            for(int j=1;j<n;j++){
                if(arr[i]!=arr[j]){
                    i++;
                    arr[i]=arr[j];
                }
            }
            return i+1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,1,2,2,2,3,3,3,4,5,5,6};
        System.out.println(duplicates(arr));
    }
}
