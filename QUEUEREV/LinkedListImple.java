
public class LinkedListImple {
public static class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public static class Queue{
static Node head = null;
static Node tail = null;

public static boolean isEmpty(){
    if(head==null){
        return true;
    }
    return false;
}
public static void enque(int data){
    Node n = new Node(data);
    if(head==null && tail==null){
        head=n;
        tail=n;
        return;
    }
    tail.next = n;
    tail = n;
}
public static void dequeue(){
    if(head==null){
        System.out.println("QUEUE IS EMPTY");
        return;
    }
    head = head.next;
}
public static int peek(){
if(head==null){
    System.out.println("QUEUE IS EMPTY");
    return -1;
}
return head.data;
}
}
public static void main(String[] args) {
    Queue q = new Queue();
    q.enque(10);
    q.enque(20);
    q.enque(30);
    q.enque(80);

    q.dequeue();

    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.dequeue();
    }
}

}
