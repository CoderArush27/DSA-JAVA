import java.util.ArrayList;

public class PairSum {
    //can only be applied on sorted array
    public static boolean sumPair(ArrayList<Integer> list,int target){
        int LP = 0;
        int RP = list.size()-1;
        while(LP<RP){
            int sum = list.get(LP)+list.get(RP);
            if(sum == target)
                return true;
            if(sum > target)
                RP--;
            else
                LP++;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(sumPair(list, 10));
    }
}
