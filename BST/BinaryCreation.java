
import java.util.*;

public class BinaryCreation {
    class Node{
        int data;
        Node right;
        Node left;
    }
    Scanner sc = new Scanner(System.in);
    Node root;
    BinaryCreation(){
        this.root = createTree();
    }
    public Node createTree(){
    int x = sc.nextInt();
    Node n = new Node();
    n.data = x;
    if(sc.nextBoolean()){
        n.left = createTree();
    }
    if(sc.nextBoolean()){
        n.right = createTree();
    }
    return n;
    }
public static void main(String[] args) {
    BinaryCreation bs = new BinaryCreation();

}
}
