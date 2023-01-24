public class Palindrome {
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
        if(head == null){
            head = tail = n;
            return;
        }
        n.next = head;
        head = n;
    }
    void print(Node head){

        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

public static Node midValue(Node head){
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
    }   
    return slow;
}
   public static boolean checkPalin(){

        if(head==null || head.next ==null){
            return true;
        }
        //find mid
        Node mid = midValue(head);

        //reverse 2n half
        Node p,q = null;
        Node r = mid;
        while(r!=null){
            p = q;
            q = r;
            r = r.next;
            q.next = p;
        }
        Node right = q;
        //compare
        boolean flag = false;
        while(right!=null){
        if(head.data == right.data){
            flag = true;
            right = right.next;
            head = head.next;
        }
        else{
            flag = false;
            return false;
        }
    }
    return flag;
    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(2);
        p.push(1);

        p.print(head);

       System.out.println(p.checkPalin());
    }
}
