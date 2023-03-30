public class ReverseLinkedList {
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

    public void reverse(){
        
        Node p = null;
        Node q = null;
        Node r = head;

        while(r!=null){
            p = q;
            q = r;
            r = r.next;
            q.next = p;
        }
        head = q;
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
        ReverseLinkedList r = new ReverseLinkedList();
        r.push(5);
        r.push(4);
        r.push(3);
        r.push(2);
        r.push(1);
        
        r.print(head);

        r.reverse();

        r.print(head);
    }
}
