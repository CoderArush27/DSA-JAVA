//it is a sorting technique in which largest element is arranged first performing a cointinous swapping
// n*(n-1)/2 sorting is being performed
// 
public class Bubble {
    public static void print(int arr[]){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;i++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,6,7,3};
        bubbleSort(arr);
        print(arr);

    }
}
