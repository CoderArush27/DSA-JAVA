public class QuickSort {
    public void quickSorting(int arr[],int si,int ei){
        if(si>=ei)
            return;
        
        int pIdx = partition(arr,si,ei);
        quickSorting(arr, si, pIdx-1);
        quickSorting(arr, pIdx+1, ei);
    }

    public int partition(int arr[],int si,int ei){
        int j=si-1;
        int pivot = arr[ei];
        for(int i=si;i<ei;i++){
            if(arr[i]<=pivot){
                j++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //to place pivot at it's correct position
        j++;
        int temp = pivot;
        arr[ei] = arr[j];
        arr[j] = temp;

        return j; //pivot index
    }

    public void print(int a[]){
        for(int x:a){
            System.out.print(x+" ");
        }
       }
    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        int arr[]={6,3,9,8,2,5};
        int n = arr.length;
        q.quickSorting(arr, 0,n-1);
        q.print(arr);
    }
}
