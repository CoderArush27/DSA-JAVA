public class QuickSort {
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei)
        return;

        int PivotIndex = partition(arr,si,ei);
            quickSort(arr, si, PivotIndex-1);
            quickSort(arr, PivotIndex+1, ei);
        }
    
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int j = si-1;
        for(int i=si;i<ei;i++){
            if(arr[i]<=pivot){
                j++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        j++;
        int temp = pivot;
        arr[ei]=arr[j];
        arr[j]=temp;
        
        return j;
    }
    public static void print(int arr[]){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={10,7,8,9,1,5};
        print(arr);
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
}
