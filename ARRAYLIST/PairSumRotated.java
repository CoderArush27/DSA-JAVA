//in this question we have the find the pair sum of rotated sorted array
import java.util.ArrayList;
public class PairSumRotated {
    public static boolean pairSum(ArrayList<Integer> list,int target){
        int n = list.size();
        int pivot = -1;
        //find the pivot point
        for(int i=0;i<n;i++){
            if(list.get(i)>list.get(i+1)){
                pivot = i;
                break;
            }
        }
        //same as pair sum using propeties of modulous
        int LP = pivot+1;
        int RP = pivot;

        while(LP!=RP){
            int sum = list.get(LP)+list.get(RP);
            if(sum == target)
                return true;

            if(sum<target)
            LP = (LP+1)%n;

            else
            RP = (n+RP-1)%n;
        }
        return false;
    }
public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);   
        list.add(10);
        System.out.println(pairSum(list,38));   
}    
}
