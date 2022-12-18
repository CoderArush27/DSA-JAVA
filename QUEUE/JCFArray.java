import java.util.*;
public class JCFArray {
    public static void main(String[] args) {
        
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(90);
        q1.add(100);
        q1.add(150);

        while(! q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
