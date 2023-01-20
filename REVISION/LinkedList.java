public class LinkedList {
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

    int length(Node head){
        int count=0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    void push(int data){
        Node n = new Node(data);
        if(head == null){
            head = tail = n;
            return;
        } 
        n.next = head;
        head = n;
    }

    void append(int data){
        Node n = new Node(data);
        if(head == null){
            head=tail=n;
        }
        // Node temp = head;
        // while(temp.next!=null){
        //     temp=temp.next;           //tail is not known
        // }
        // temp.next = n;
        // tail = n;
        tail.next = n;
        tail = n;
    }
    void insertAtMiddle(int data){
        int l=length(head)/2;;
        int i=1;
        Node temp = head;
        Node prev = null;
        Node n = new Node(data);
        while(i<l){
            prev = temp;
            temp = temp.next;
            i++;
        }
        prev.next = n;
        n.next = temp;
    }
    void deleteBegin(){
        head = head.next;
    }

    void deleteEnd(){
        Node temp = head;
        Node prev = null;
        while(temp.next!=null){
            prev = temp;
            temp=temp.next;
        }
        prev.next = null;
    }
    void deletePos(int pos){
        Node temp = head;
        Node prev = null;
        int i=1;
        while(i<pos){
            prev = temp;
            temp = temp.next;
            i++;
        }
        prev.next = temp.next;
    }
    int search(int key){
        Node temp = head;
        while(temp!=null){
            if(temp.data == key){
                return 1;
            }
            temp = temp.next;
        }
        return -1;
    }
    int recSearch(Node head,int key){
        if(head==null)
            return -1;
        if(head.data == key)
            return 1;

        return recSearch(head.next, key);
    }
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.push(10);
        l.push(20);
        l.append(50);
        l.append(100);
        l.insertAtMiddle(90);
        // l.deleteBegin();
        // l.deleteEnd();
        // l.deletePos(2);
        l.print(head);
        System.out.println(l.search(220)); 
        System.out.println(l.recSearch(head, 70));
        System.out.println("length of linked list= "+l.length(head)); 
    }
}
