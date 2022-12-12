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


    void push(int data){
        Node n = new Node(data);
        if(head==null){
            head = tail = n;
            return;
        }
        n.next = head;
        head = n;
    }

    void append(int data){
        Node n = new Node(data);
        if(head==null){
            head = tail =n;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = n;
        tail=n;
    }

    void insertAtPos(int data,int pos){
        Node n = new Node(data);
        if(pos==0)
            return;
        int p=1;
        Node temp = head;
        while(p<pos-1){
            temp=temp.next;
            p++;
        }
        n.next = temp.next;
        temp.next = n;
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

    void deleteBegin(){
        head = head.next;
    }
    void deleteEnd(){
        Node temp=head;
        Node prev=null;
        while(temp.next!=null){
            prev = temp;
            temp=temp.next;
        }
        prev.next=null;
    }
    void deletePos(int pos){
        Node temp=head;
        Node prev = null;
        int i=1;
        while(i<=pos-1){
            prev = temp;
            temp=temp.next;
            i++;
        }
        prev.next = temp.next;
    }
    int search(Node head,int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data == key)
                return i;
            temp=temp.next;
            i++;
        }
        return -1;
    }
    void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.push(10);
        l.push(20);
        l.push(30);

        l.append(70);
        l.append(80);
        l.append(90);

        l.insertAtPos(100, 3);
        System.out.println("LENGTH OF LINKED LIST = "+ l.length(head));
        

        l.print(head);
        l.deleteBegin();
        l.print(head);
        l.deleteEnd();
        l.print(head);
        l.deletePos(3);
        l.print(head);

        System.out.println(l.search(head, 100));
    }
}
