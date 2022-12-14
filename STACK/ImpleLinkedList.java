

public class ImpleLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;

        public boolean isEmpty(){
            return head==null;
        }

        public void push(int data){
            Node n =new Node(data);
            if(head==null){
                head = n;
                return;
            }
            n.next = head;
            head = n;
        }

        public int pop(){
            if(head==null)
                return -1;

            int top = head.data;
            head = head.next;

            return top;
        }

        public int peek(){
            if(head==null)
            return -1;

            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        while(!(s.isEmpty())){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
