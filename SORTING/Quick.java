public class Quick {

    public static void print(int arr[]){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int parIdx = partition(arr,si,ei);
        quickSort(arr, 0,parIdx-1);
        quickSort(arr, parIdx+1, ei);

    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;

        return i;
    }
    public static void main(String[] args) {
        int arr[]={6,3,8,2,9,5};
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
}
