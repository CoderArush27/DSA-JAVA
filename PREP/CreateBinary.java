public class CreateBinary {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
public static class BinaryTree{
    static int idx = -1;
    public Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node n = new Node(nodes[idx]);
        n.left = buildTree(nodes);
        n.right = buildTree(nodes);

        return n;   //which is the rrot node node due to backtracking
    }

    public static void PreOrder(Node root){      // root-> left -> right
        if(root==null){
            System.out.print(-1+" ");            
            return;
        }
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void PostOrder(Node root){      //left->right->root
        if(root == null){  
            System.out.print(-1+" ");
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void inOrder(Node root){      //left->root->right
        if(root == null){
            System.out.print(-1+" ");
            return;
        }
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }
}
public static void main(String[] args) {
    int arr[]={1,5,9,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    BinaryTree tree = new BinaryTree();
    Node root =  tree.buildTree(arr);
    tree.PreOrder(root);
    System.out.println();
    tree.PostOrder(root);
    System.out.println();
    tree.inOrder(root);
}
}
