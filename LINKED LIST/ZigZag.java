public class ZigZag {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    void push(int data){
        Node n = new Node(data);
        if(head==null){
            head = tail = n;
            return;
        }
        n.next = head;
        head = n;
       }

void mergeZigZag(){
    //find middle node
    Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid= slow;

    //reverse 2nd half
        Node p = mid.next;
        mid.next = null;

        Node q = null;
        Node r = null;

        while(p!=null){
           r = q;
           q = p;
           p = p.next;
           q.next = r;
        }
    Node rightHead = q;
    Node leftHead = head;
    Node nextL,nextR;
    //alternate merging
        while(leftHead!=null && rightHead!=null){
            nextL = leftHead.next;
            leftHead.next = rightHead;
            nextR = rightHead.next;
            rightHead.next = nextL;

            //update
            leftHead = nextL;
            rightHead = nextR;        
        }
    }
    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ZigZag l = new ZigZag();
        l.push(5);
        l.push(4);
        l.push(3);
        l.push(2);
        l.push(1);
        l.print();

        l.mergeZigZag();
        l.print(); 
    }
}
