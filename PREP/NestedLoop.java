
public class NestedLoop {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+",");
            for(int j=0;j<i;j++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
