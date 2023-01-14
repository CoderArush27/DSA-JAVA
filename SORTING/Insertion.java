//it is a sorting algorithm in which elements are sorted in a way of sorting cards
//array is virtuallly split into sorted and unsorted part and elements from unosrted part is picked and laced at a correcct position in a sorted part
//mostly used in case of partially sorted array

public class Insertion {
    public static void print(int arr[]){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int cur = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev]>cur){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=cur;
        }

    }
    public static void main(String[] args) {
        int arr[]={2,1,3,6,8,9,7};
        insertionSort(arr);
        print(arr);
    }
}
