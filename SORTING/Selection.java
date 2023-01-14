
public class Selection {
    public static void SelectionSort(int arr[]){
        int minIdx;
        for(int i=0;i<arr.length-1;i++){
            minIdx = i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp; 
        }
    }
    public static void main(String[] args) {
        
    }
}
