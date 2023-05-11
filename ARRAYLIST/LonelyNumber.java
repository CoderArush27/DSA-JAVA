import java.util.ArrayList;
import java.util.*;
public class LonelyNumber {

    public static <ArrayList> lonely(ArrayList<Integer> num){
        int n = num.size();
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,num.get(i));
        }
        int heap[] = new int[max];
        for(int i=0;i<max;i++){
            heap[num.get(i)]++;
        }

    }
    public static void main(String[] args) {
        
    }
}
