// LOOP DETECTING ALGORITHM IS ALSO KNOWN AS FLOYD'S CYCLE DETECTING ALGORITHM
public class DeletingLoop {
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

boolean loopDetect(Node h){
    Node slow= h;
    Node fast = h;
    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;

        if(fast==slow)
            return true; 
    }
    return false;
}
void deleteLoop(Node h){
    Node slow= h;
    Node fast = h;
    Node prev = null;
    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;

        if(fast==slow)
           slow = head;
           break;
    }
    while(slow!=fast){
       prev = fast;
       slow = slow.next;
       fast = fast.next;
    }
    prev.next = null;
}
public static void main(String[] args) { 
    DeletingLoop l = new DeletingLoop();
    l.push(10);
    l.push(20);
    l.push(30);
    l.push(40);
    l.push(50);
    l.push(60);
    l.head.next.next.next.next = l.head;

    if(l.loopDetect(null))
        System.out.println("LOOP DETECTED");
    else    
        System.out.println("LOOP NOT DETECTED");

}
}