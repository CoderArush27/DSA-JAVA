public class MergeSortLL {
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

    Node midNode(Node head){
    
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node mid = midNode(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft,newRight);
    }

    Node merge(Node left,Node right){
        Node mergeList = new Node(-1);
        Node temp = mergeList;

        while(left!=null && right!=null){
            if(left.data <= right.data){
                temp.next = left;
                temp = temp.next;
                left=left.next;
            }
            else{
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }
        }
        while(left!=null){
            temp.next=left;
            temp=temp.next;
            left=left.next;
        }
        while(right!=null){
            temp.next = right;
            temp = temp.next;
            right =right.next;
        }
        return mergeList.next;
    }
    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSortLL l = new MergeSortLL();
        l.push(3);
        l.push(4);
        l.push(1);
        l.push(7);
        l.print();

        l.head=l.mergeSort(head);
        l.print();
    }
}
