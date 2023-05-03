import java.util.*;
public class NextPermutation{
    public static void nextPermute(int arr[]){
                int n = arr.length;
                int bIdx = -1;  //breaking index
                //break point kro find jis point pr arr[i]<arr[i+1]
                for(int i=n-2;i>=0;i--){
                    if(arr[i]<arr[i+1]){
                        bIdx = i;
                        break;
                    }
                }
                //if array is in descending order
                if(bIdx==-1){
                    Arrays.sort(arr,0,n);
                    return;
                }
                for(int i=n-1;i>bIdx;i--){
                    if(arr[i]>arr[bIdx]){
                        int temp = arr[i];
                        arr[i]=arr[bIdx];
                        arr[bIdx] = temp;
                        break;
                    }
                }
                Arrays.sort(arr,bIdx+1,n);
            }
    public static void print(int arr[]){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,2,1};
        nextPermute(arr);
        print(arr);
    }
}