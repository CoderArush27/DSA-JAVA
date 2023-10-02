import java.util.*;

public class RevStack {
    public static void rev(Stack<Integer>s){
        if(s.empty()){
            return;
        }
        int top = s.pop();
        rev(s);
        pushAtBottom(s,top);
    }
    public static void pushAtBottom(Stack<Integer>s,int x){
        if(s.empty()){
            s.push(x);
            return;       
        }
        int top = s.pop();
        pushAtBottom(s, x);
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
        s.push(20);
        s.push(30);

        rev(s);
        print(s);
    }
}
