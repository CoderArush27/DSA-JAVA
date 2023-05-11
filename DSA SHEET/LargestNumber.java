
public class LargestNumber {
    public static void largest(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            String x = Integer.toString(arr[i]);
            for(int j=i+1;j<n;j++){
                String y = Integer.toString(arr[j]);
                String xy = x + y;
                String yx = y + x;

                if(xy.compareTo(yx)<0){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int x:arr){
            System.out.print(x);
        }
    }
    public static void main(String[] args) {
        int arr[]= {3,30,34,5,9};
        largest(arr);
    }
}
