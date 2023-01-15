

public class RotateArray {
    public static void print(int arr[]){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void rotate(int arr[],int k){
        int temp[]=new int[arr.length];
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            temp[(i+k)%n]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=3;
        rotate(arr, k);
        print(arr);
    }
}
