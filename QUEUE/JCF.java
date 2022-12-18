//queue can be implement using JCF USING LINKED LIST AND ARRAYDEQUE
import java.util.*;
import java.util.LinkedList;
public class JCF {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(50);
        q1.add(60);
        q1.add(70);

        while(! q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }

    }
}
