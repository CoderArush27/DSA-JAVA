import java.util.*;
public class ValidParenthesis {
    public static boolean valid(String str){

        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);

            if(c=='(' || c=='[' || c=='{'){
                s.push(c);
            }

            else {
                //closing
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && c==')')||(s.peek()=='{' && c=='}')||(s.peek()=='[' && c==']')){
                    s.pop();
                }
    }
}
        if(s.isEmpty())
        return true;

        return false;
}
    public static void main(String[] args) {
        String str = "({[]}))";
        boolean flag = valid(str);

        if(flag)
        System.out.println("VALID PARENTHESIS");
        else
        System.out.println("NOT A VALID PARENTHESIS");
    }
}
