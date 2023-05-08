import java.util.ArrayList;

public class Basic{
    public static void main(String[] args) {
        //ArrayList class is a resizable/dynamic array
        
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.set(2, 50);
        list1.add(3,100);
        // System.out.println(list1.remove(3));
        // System.out.println(list1.get(2));
        System.out.println(list1);
        System.out.println(list1.contains(150));
        System.out.println(list1.contains(100));
    }
}