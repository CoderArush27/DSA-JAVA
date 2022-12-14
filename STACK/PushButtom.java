import java.util.*;

public class PushButtom {
    public static void pushAtButtom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtButtom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(50);
        
        pushAtButtom(s, 80);

        while(! s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
