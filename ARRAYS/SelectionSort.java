import java.util.*;
public class SelectionSort {
    public static void print(int arr[]){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void selSor(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minInd = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minInd]>arr[j]){
                    minInd = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minInd];
            arr[minInd] = temp;
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
        selSor(arr);
        System.out.println("AFTER");
        print(arr);
    }
}
