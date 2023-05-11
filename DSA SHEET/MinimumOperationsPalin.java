public class MinimumOperationsPalin {
    public static int operation(int arr[]){
        int n = arr.length;
        int i=0;
        int j=n-1;
        int count = 0;

        while(i<=j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else if(arr[i]>arr[j]){   //last se merge kro
                arr[j-1]=arr[j]+arr[j-1];
                j--;
                count++;
            }
            else{
                arr[i+1]=arr[i]+arr[i+1];
                i++;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={14,12,13,19};
        System.out.println(operation(arr));
    }
}
