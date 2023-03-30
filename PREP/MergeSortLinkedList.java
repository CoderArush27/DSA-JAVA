public class MergeSortLinkedList {
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

    public Node middle(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public Node mergeSort(Node head){
        if(head == null || head.next==null)
            return head;
        
        Node mid = middle(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft,newRight);
    }

    public Node merge(Node left,Node right){
        Node mergeList = new Node(-1);
        Node temp = mergeList;
        while(left!=null && right!=null){
            if(left.data<right.data){
                temp.next = left;
                left = left.next;
                temp = temp.next;
            }
            else{
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }
        while(left!=null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while(right!=null){
            temp.next = right;
            right = right.next;
            temp= temp.next;
        }
        return mergeList.next;
    }


    void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MergeSortLinkedList m =new MergeSortLinkedList();
        m.push(3);
        m.push(6);
        m.push(1);
        m.push(8);
        m.push(9);
        m.push(2);

        head = m.mergeSort(head);
        m.print(head);
    }
}
