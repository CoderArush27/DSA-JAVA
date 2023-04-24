public class BubbleSortRec {
    public static void bubbleSort(int arr[],int n){
        if(n==0 || n==1)
        return;

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSort(arr, n-1);
    }
    public static void print(int arr[]){
        for(int x:arr)
            System.out.print(x+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]={2,8,1,3,6,4};
        bubbleSort(a, a.length);
        print(a);
    }
}
