import java.util.*;
public class JCF {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(40);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove(); 
        }
    }
}
