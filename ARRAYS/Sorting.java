public class Sorting {

    public static void print(int arr[]){
        for(int x:arr)
            System.out.print(x+" ");

        System.out.println();
    }

    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int prev = i-1;
            int cur  = arr[i];
            while(prev>=0 && arr[prev]>cur){   
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = cur;
        }
    }

    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei)
        return;

        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){
        int i = si;
        int j = mid+1;
        int k = 0;
        int temp[] = new int[ei-si+1];

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i];
                i++;
            }
            else{
                temp[k++]=arr[j];
                j++;
            }
        }
        while(i<=mid)
        temp[k++]=arr[i++];

        while(j<=ei)
        temp[k++]=arr[j++];

        for(int t=0,p=si;t<temp.length;t++,p++){
            arr[p]=temp[t];
        }
    }

    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei)
        return;

        int pIdx = partition(arr,si,ei);
        quickSort(arr, si,pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }

    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int k = si-1;
        
        for(int i=si;i<ei;i++){
            if(arr[i]<pivot){
                k++;
                int temp = arr[k];
                arr[k]=arr[i];
                arr[i] = temp;
            }
        }
        //correct position of pivot element
        k++;
        int temp = arr[k];
        arr[k]=pivot;
        arr[ei] = temp;

        return k;
    }
    public static void main(String[] args) {
        int arr[]={2,6,1,3,5};
        int arr1[]={11,6,56,959,594,4484,1,56,9,9,415,6,98};
        quickSort(arr,0,arr.length-1);
        print(arr);
    }
}
