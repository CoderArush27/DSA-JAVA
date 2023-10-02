
public class LinkedListImple {
    static class Node{
        int data;
        Node next;

        Node(int x){
            this.data = x;
            this.next = null;
        }
    }
   
    static class Stack{
         static Node head = null;
         public static boolean isEmpty(){
            return head==null;
         }
        public static void push(int x){
            Node n = new Node(x);
            if(head == null){
            head = n;
            return;
            }
            n.next = head;
            head = n;
        }
        public static int pop(){
            if(isEmpty())
            return -1;

            int x = head.data;
            head = head.next;
            return x;
        }
        public static int peek(){
            if(isEmpty())
            return -1;

            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(100);

        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
