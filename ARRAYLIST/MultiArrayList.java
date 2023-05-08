import java.lang.reflect.Array;
import java.util.ArrayList;

public class MultiArrayList {
    public static void main(String[] args) {
        
        ArrayList<ArrayList> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
        }
        list3.add("ARUSH");
        list3.add("GUPTA");
        list3.add("CODER");
        list.add(list1);
        list.add(list2);
        list.add(list3);

        System.out.println(list);
    }   
}
