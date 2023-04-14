import java.util.*;
import javax.lang.model.util.ElementScanner6;
public class BinaryTreeLevel {
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
            if(nodes[idx] == -1){
                return null;
            }
            Node n = new Node(nodes[idx]);
            n.left = buildTree(nodes);
            n.right = buildTree(nodes);

            return n;
        }

    public static void LevelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root == null)
            return;

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left !=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    }
    public static void main(String[] args) {
    int arr[]={1,5,9,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    BinaryTree tree = new BinaryTree();
    Node root =  tree.buildTree(arr);
    tree.LevelOrder(root);
    }
    
}
