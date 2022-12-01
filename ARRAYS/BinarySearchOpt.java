import java.util.*;
public class BinarySearchOpt {
    public static void print(int a[]){
        for(int x:a){
            System.out.print(x+" ");
        }
    }

    public static void BinaryOpt(int a[]){
        int n = a.length;
        boolean swapped = false;
        for(int i=0;i<n;i++){
            swapped = false;
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j]= temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER SIZE");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("ENTER ELEMENTS");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("UNSORTED");
        print(arr);
        System.out.println();
        System.out.println("SORTED");
        BinaryOpt(arr);
        print(arr);
    }
}
