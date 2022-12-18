public class ImpleLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null;
        }

        public static void add(int data){
            Node n = new Node(data);
            //first node
            if(head==null){
                head = tail = n;
                return;
            }
            tail.next = n;
            tail = n;
        }

        public static int remove(){
            if(head==null){
                return -1;
            }
                int result = head.data;
                head = head.next;
        return result;
        }

        public static int peek(){
            if(head==null){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);

        while(! q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
