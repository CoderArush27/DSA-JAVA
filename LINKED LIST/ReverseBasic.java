public class ReverseBasic {
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
    

    void push(int data){
        Node n = new Node(data);
        if(head==null){
            head=tail=n;
            return;
        }
        n.next = head;
        head = n;
    }
    void reverse(){
        Node p,q = null;
         Node r = tail = head;
        while(r!=null){
            p = q;
            q = r;
            r = r.next;
            q.next = p;
        }
        head = q;
    }
int size(Node head){
    int count=0;
    while(head!=null){
        count++;
        head=head.next;
    }
    return count;
}
    void deleteNthend(int posEnd){
        int l = size(head);

        int posSrt = l-posEnd+1;
        int pos=1;
        Node temp = head;
        Node prev = null;
        while(pos<=posSrt-1){
            prev = temp;
            temp = temp.next;
            pos++;
        }
        prev.next = temp.next;
    }
    void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        ReverseBasic r = new ReverseBasic();
        r.push(10);
        r.push(20);
        r.push(30);
        r.push(40);
        r.push(50);
        r.push(90);
        r.push(200);

        r.print(head);
        System.out.println("REVERSED");
        r.reverse();
        r.print(head);
        System.out.println();
        r.deleteNthend(3);
        r.print(head);
    }
}