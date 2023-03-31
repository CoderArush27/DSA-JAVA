public class BinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    public static class BinaryT{
        static int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]== -1)
                return null;
            Node n = new Node(nodes[idx]);
            n.left = buildTree(nodes);
            n.right = buildTree(nodes);

            return n;
        }

        public void preOrder(Node root){
            if(root==null)
                return;
            System.out.print(root.data+" "); 
            preOrder(root.left);
            preOrder(root.right); 
        }

        public void postOrder(Node root){
            if(root == null)
                return;
            
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }

        public void inOrder(Node root){
            if(root==null)
                return;

            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    public static void main(String[] args) {
        BinaryT p = new BinaryT();
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = p.buildTree(arr);
        p.preOrder(root);
        System.out.println();
        p.postOrder(root);
        System.out.println();
        p.inOrder(root);
    }
}
