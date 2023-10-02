import java.util.*;

public class PushAtBottom {
    public static void pushBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }
    public static void print(Stack<Integer>s){
        while(!s.empty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(15);
        s.push(20);

        pushBottom(s, 5);
        print(s);
    
    }
}
