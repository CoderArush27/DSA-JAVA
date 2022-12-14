import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

public class ReverseString {
    public static String reverse(String str){
        //inserting inside stack
        Stack<Character>c = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            c.push(str.charAt(idx));
            idx++;
        }
        //taking out of stack and storing inside string builder
        StringBuilder n = new StringBuilder("");
        while(!c.isEmpty()){
            char ch = c.pop();
            n.append(ch);
        }
        str = n.toString();
        //returning value
        return str;
    }
    public static void main(String[] args) {
        System.out.println(reverse("ARUSH"));
    }
}
