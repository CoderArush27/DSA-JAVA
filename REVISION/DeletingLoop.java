public class DeletingLoop{
    public static class Node{
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

        boolean loopDetect(){
            Node slow= head;
            Node fast = head;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
        
                if(fast==slow)
                    return true; 
            }
            return false;
        }

        void deleteLoop(){
            Node slow = head;
            Node fast = head;
            boolean flag=false;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;

                if(slow==fast){
                    flag = true;
                    break;
                }
            }
            if(flag==false)
                return;
            
            slow = head;
            Node prev = null;
            while(slow!=fast){
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
            prev.next = null;
        }


    public static void main(String[] args) {
        DeletingLoop d = new DeletingLoop();
        d.push(10);
        d.push(20);
        d.push(30);
        d.push(40);
        d.push(50);
        d.push(60);
        Node temp = d.head.next.next.next;
        d.head.next.next.next.next.next.next = temp;
        if(d.loopDetect())
            System.out.println("LOOP DETECTED");
        else
            System.out.println("NOT DETECTED");

        d.deleteLoop();

        if(d.loopDetect())
            System.out.println("LOOP DETECTED");
        else
            System.out.println("NOT DETECTED");

    }
}
