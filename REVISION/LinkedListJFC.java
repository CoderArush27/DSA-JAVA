import java.util.LinkedList;
public class LinkedListJFC {
    public static void main(String[] args) {
    LinkedList <Integer> ll =new LinkedList<>();
    ll.addFirst(10);
    ll.addLast(15);
    ll.addFirst(5);
    System.out.println(ll);
    ll.removeLast();
    ll.removeFirst();
    System.out.println(ll);
}
}