public class LinkedListBasics {
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void push(int data){
        Node n = new Node(data);
        if(head==null){
            head = tail = n;
            return;
        }
        n.next = head;
        head = n;
    }

    public void append(int data){
        Node n = new Node(data);
        if(head==null){
            head = tail = n;
            return;
        }
        tail.next = n;
        tail = n;
    }

    public int length(){
        int l=0;
        Node temp =head;
        while(temp!=null){
            l++;
            temp = temp.next;
        }
        return l;
    }
    public void pos(int data,int pos){
        
        if(pos>length()){
            return;
        }
        Node n = new Node(data);
        int i=1;
        Node temp = head;
        while(i<pos){
            temp = temp.next;
            i++;
        }
        n.next = temp.next;
        temp.next = n;
    }

    public void deleteHead(){
        if(head==null)
            return;
        head = head.next;
    }

    public void deleteEnd(){
        if(head==null)
            return;
        
        Node temp = head;
        Node prev = null;
        while(temp.next!=null){
            prev = temp;
            temp=temp.next;
        }
        prev.next = null;
    }

    public void deletePos(int pos){
        if(head==null || pos>length())
            return;
        
        Node temp =head;
        Node prev = null;
        int i=1;
        while(i<=pos-1){
            prev = temp;
            temp = temp.next;
            i++;
        }
        prev.next = temp.next;
    }
    public void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean search(int key){
        Node temp = head;
        while(temp!=null){
            if(temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedListBasics l = new LinkedListBasics();
        l.push(10);
        l.append(20);
        l.push(5);
        l.append(30);
        
        l.pos(50, 1);
        System.out.println("length = "+l.length());

        l.append(70);
        l.push(100);

        l.print(head);

        l.deleteEnd();
        l.print(head);

        l.deleteHead();
        l.print(head);

        l.deletePos(3);
        l.print(head);

        System.out.println(l.search(100));
       
    }
}
