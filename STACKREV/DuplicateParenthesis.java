import java.util.*;
public class DuplicateParenthesis {
    public static boolean duplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            //closing
            if(c==')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count<1)
                return true;

                else
                s.pop();
            }
            //opening,alphabets,operators
            else{
                s.push(c);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "(((((a+b)+(c+d)))))";
        String str1 = "(a+b)";
        System.out.println(duplicate(str));
        System.out.println(duplicate(str1));
    }
}
