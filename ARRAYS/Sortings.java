public class Sortings {
    static void print(int arr[]){
        for(int x:arr)
        System.out.print(x+" ");
        System.out.println();
    }
    static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void selectionSort(int arr[]){
        int min;
        for(int i=0;i<arr.length-1;i++){
            min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int cur = arr[i];
            int prevIdx = i-1;

            while(prevIdx>=0 && arr[prevIdx]>cur){
                arr[prevIdx+1] = arr[prevIdx];
                prevIdx--; 
            }
            arr[prevIdx+1] = cur;
        }
    }
    public static void main(String[] args) {
        int arr1[]={3,6,9,11,2,4,1};
        int arr2[]={3,9,8,1,2,4,7,6};
        bubbleSort(arr1);
        print(arr1);
        selectionSort(arr2);
        print(arr2);
    }
}
