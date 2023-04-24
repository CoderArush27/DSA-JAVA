import java.util.*;
public class RevStack {
    public static void main(String[] args) {
        String str = "geeks for geeks";
        //reversing a string using stack
        Stack <Character> s = new Stack<>();

        for(char c:str.toCharArray())
            s.push(c);

        String temp="";

        while(!s.isEmpty())
            temp += s.pop();
    System.out.println(temp);
    }
}
