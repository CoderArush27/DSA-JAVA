import java.util.*;
public class InsertionSort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void inSort(int arr[]){
       for(int i=1;i<arr.length;i++){
        int curr = arr[i];
        int prev = i-1;
        //this loop is used to finf correct position
        while(prev>=0 && (arr[prev]>curr)){
            arr[prev+1]=arr[prev];
            prev--;
        }
        //inserting at correct position
        arr[prev+1]=curr;
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
        
        System.out.println("AFTER");
        inSort(arr);
        print(arr);
    }
}
