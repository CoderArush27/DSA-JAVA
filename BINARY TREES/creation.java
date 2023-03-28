
import java.util.*;
public class creation {
    public static class Node{
        int data;
        Node left;
        Node right;

        //constructor
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree{
        static int idx = -1;    //static so it changes accordingly and belongs to the class
        public Node buildTree(int nodes[]){        //this is of type of node because it returns the root node
            idx++;
            if(nodes[idx]==-1)
                return null;
            
            Node n = new Node(nodes[idx]);
            n.left = buildTree(nodes);
            n.right = buildTree(nodes);

            return n;
        }

        public void preOrder(Node root){
            if(root == null){
                System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public void inOrder(Node root){
            if(root == null)
                return;

            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        public void postOrder(Node root){
            if(root == null)
                return;

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        BinaryTree n = new BinaryTree();
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = n.buildTree(arr);
        //Traversals
        System.out.println("PREORDER TRAVERSAL");
        n.preOrder(root); 

        System.out.println();
        System.out.println("INORDER TRAVERSAL");
        n.inOrder(root);  

        System.out.println();
        System.out.println("POSTORDER TRAVERSAL");
        n.postOrder(root); 

    }
}
