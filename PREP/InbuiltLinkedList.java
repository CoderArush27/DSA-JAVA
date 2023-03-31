import java.util.*;
import java.util.LinkedList;
public class InbuiltLinkedList {
    public static void main(String[] args) {
        LinkedList <Integer> ll = new LinkedList<Integer>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.addFirst(80);
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
    }
}
