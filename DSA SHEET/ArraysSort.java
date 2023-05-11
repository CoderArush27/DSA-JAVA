import java.util.Arrays;
import java.util.Comparator;
public class ArraysSort {
    public static void print(Integer ar[]){
        for(int x:ar){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        //use of inbuilt arrays.sort method

        int arr[]={1,9,3,8,7,6,5};
        Integer[] arrObj = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
         arrObj[i] = Integer.valueOf(arr[i]);
        }

        Arrays.sort(arrObj,new Comparator<Integer>() {
            public int compare(Integer a,Integer b){
                return a.compareTo(b);
            }
        });
        print(arrObj);
    }
}
