public class MergeSort {
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

       Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
       }
        
    Node mergeSort(Node head){
        if(head==null || head.next == null){
            return head;
        }
        //to find mid(in this case we need left half ke last node as mid)
        Node mid = getMid(head);
        // to call merge sort for left and right half
        Node rightHead = mid.next;
        mid.next = null;

       Node newLeft = mergeSort(head);
       Node newRight = mergeSort(rightHead);

       return merge(newLeft,newRight);
    }
   Node merge(Node left,Node right){

        Node mergedList = new Node(-1);
        Node temp = mergedList;
        while(left!=null && right!=null){
            if(left.data <= right.data){
                temp.next = left;
                left=left.next;
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
            right =right.next;
            temp = temp.next;
        }
        return mergedList.next;
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
        MergeSort l = new MergeSort();
        l.push(9);
        l.push(6);
        l.push(1);
        l.push(3);
        l.push(2);
        l.push(7);

        l.print(l.head);

        
        l.head = l.mergeSort(l.head);
        l.print(l.head);

    }
}
