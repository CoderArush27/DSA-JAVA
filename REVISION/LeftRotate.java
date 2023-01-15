

public class LeftRotate {
    public static void print(int arr[]){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void rotate(int arr[],int k){
        int n=arr.length;
        int temp[]=new int[arr.length];
        int d=0;
        //firstly copy all the elements from k to n-1 
        for(int i=k;i<n;i++){
            temp[d]=arr[i];
            d++;
        }
        //secondly copy all the elements from 0 to k
        for(int i=0;i<k;i++){
            temp[d]=arr[i];
            d++;
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
