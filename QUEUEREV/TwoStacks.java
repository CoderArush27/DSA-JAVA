import java.util.*;
public class TwoStacks {
    public static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static void remove(){
            if(s1.isEmpty()){
                System.out.println("QUEUE IS EMPTY");
                return;
            }
            s1.pop();
        }
        public static int peek(){
            if(s1.isEmpty()){
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
            Queue q = new Queue();
            q.add(10);
            q.add(20);
            q.add(30);
            q.add(40);

            while(!q.isEmpty()){
                System.out.print(q.peek()+" ");
                q.remove();
            }
    }
}
