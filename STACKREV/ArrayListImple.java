import java.util.*;

public class ArrayListImple {
    static class Stack{
        static ArrayList<Integer> s = new ArrayList<>();

        public static boolean isEmpty(){
            return s.size()==0;
        }
        public static void push(int x){
            s.add(x);
        }
        public static int pop(){
            if(isEmpty())
                return -1;
            
            int x = s.get(s.size()-1);
            s.remove(s.size()-1);
            return x;
        }
        public static int peek(){
            if(isEmpty())
                return -1;
            return s.get(s.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack k = new Stack();
        k.push(10);
        k.push(20);
        k.push(30);
        k.push(50);

        while(!k.isEmpty()){
            System.out.print(k.peek()+" ");
            k.pop();
        }

    }
}
