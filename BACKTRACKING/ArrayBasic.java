
public class ArrayBasic {
    public static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void RecOpp(int arr[],int i,int k){
        if(i==arr.length)
        {
            print(arr);
            return;
        }
        arr[i]=k; //work
        RecOpp(arr, i+1, k+1);   //ascending work
        arr[i]=arr[i]-2;
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        RecOpp(arr, 0, 1);
        print(arr);  //after backtracking(descending work)
    }
}