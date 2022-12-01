import java.util.*;
public class BubbleSort {
    public static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void BubSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("ENTER THE SIZE OF AN ARRAY");
        int n = s.nextInt();

        int []arr = new int[n];

        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("BEFORE");
        print(arr);
        BubSort(arr);
        System.out.println("AFTER");
        print(arr);
    }
}
