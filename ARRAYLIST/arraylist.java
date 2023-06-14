import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(2,70);
        list.set(2, 100);
       System.out.println(list.remove(3));
       System.out.println(list.get(2));
        System.out.println(list);
        System.out.println(list.contains(150));
    }
}
