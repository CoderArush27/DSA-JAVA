import java.util.*;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(60);
        list.add(7);
        list.add(2);

        Collections.sort(list);
        System.out.println(list);
        //using comparator function to chnage the logic of inbuilt function
        //comparator function is a fcuntion which is used to change the logic of inbuilt function
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
