public class LinkedListNthNode {
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

   int length(Node h){
    int count=0;
    Node temp=h;
    while(temp!=null){
        count++;
        temp=temp.next;
    }
    return count;
}
   void removeNthNode(Node h,int n){
    Node temp = h;
    Node prev = null;
    int i = 1;
    int l = length(h);
    while(i<l-n+1){
        prev = temp;
        temp = temp.next;
        i++;
    }
    System.out.println("delete node = "+temp.data);
    prev.next = temp.next;
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
    LinkedListNthNode l = new LinkedListNthNode();
    l.push(10);
    l.push(20);
    l.push(30);
    l.push(40);
    l.push(50);
    l.push(60);
    l.print(head);
    l.removeNthNode(head, 5);
    l.print(head);
   }
}
