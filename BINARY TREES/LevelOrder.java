import java.util.*;

import ImpleLinkedList.Node;
public class LevelOrder {
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);   //to print next line on next level

        while(! q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty())
                    break;
                else
                    q.add(null);
            }
            else{
                System.out.print(currNode.data +" ");
                if(currNode.left!=null)
                q.add(currNode.left);

                if(currNode.right!=null)
                q.add(currNode.right);
            }
        }
    }
}
