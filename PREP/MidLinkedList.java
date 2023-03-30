public class MidLinkedList {
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void push(int data){
        Node n = new Node(data);
        if(head==null){
            head = tail = n;
            return;
        }
        n.next = head;
        head = n;
    }
    public Node middle(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MidLinkedList r = new MidLinkedList();
        r.push(5);
        r.push(4);
        r.push(3);
        r.push(2);
        r.push(1);

        r.print(head);

        System.out.println("MIDDLE OF LINKED LIST = "+r.middle(head).data);
    }
}
