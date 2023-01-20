public class ReverseLinked {
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
   
    void reverse(Node h){
        Node p = h;
        Node q = null;
        Node r = null;

        while(p!=null){
          r = q;
          q = p;
          p =p.next;
          q.next = r;
        }
        head = q;
    }
   void push(int data){
    Node n = new Node(data);
    if(head==null){
        head = tail = n;
        return;
    }
    n.next = head;
    head = n;
   }
   void print(Node head){
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.println();
   }
   public static void main(String[] args) {
    ReverseLinked l = new ReverseLinked();
    l.push(10);
    l.push(20);
    l.push(30);
    l.push(40);
    l.push(50);
    l.print(head);
    System.out.println();
    System.out.println("reversed");
    l.reverse(head);
    l.print(head);
   }
}
