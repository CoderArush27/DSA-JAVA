public class LinkedListRev {
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
        if(head == null){
        head = n;
        tail = n;
        return;
        }

        n.next = head;
        head = n;
    }

    public void append(int data){
        Node n = new Node(data);
        if(head==null){
            head = n;
            tail = n;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
    }
    public int length(Node head){
        Node temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public void insertAtAny(int pos,int data){
        int l = length(head);
        Node n = new Node(data);
        Node temp = head;
        if(pos>l){
            System.out.println("cannot be inserted overflow");
            return;
        }
        int i=0;
        while(i<pos-1){
            temp = temp.next;
            i++;
        }
        n.next = temp.next;
        temp.next = n;
    }

    public void deleteBegin(){
        if(head==null){
            System.out.println("underflow");
            return;
        }
        head = head.next;
    }

    public void deleteEnd(){
        Node temp = head;
        Node prev = null;
        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }
    public void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static void reverse(){
        Node p = head;
        Node q = null;
        Node r = null;
        while(p!=null ){
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        head = q;
    }
    public int middleEle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        LinkedListRev l = new LinkedListRev();
        l.push(10);
        l.push(20);
        l.push(30);
        l.push(4);
        l.append(800);
        l.insertAtAny(2, 700);
        l.deleteBegin();
        l.deleteEnd();
        l.print(head);
        l.reverse();
        l.print(head);
        System.out.println(l.middleEle(head));
    }
}
