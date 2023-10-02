import java.util.*;

public class RevString {
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        int i = 0;
        StringBuilder n = new StringBuilder("");
        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        }
        while(!s.isEmpty()){
            n.append(s.pop());
        }
        return n.toString();
    } 
    public static void main(String[] args) {
        String str = "ARUSH GUPTA";
        System.out.println(reverse(str));
    }
}
