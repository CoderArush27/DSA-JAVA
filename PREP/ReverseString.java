import java.util.*;
public class ReverseString{
    public static String Reverse(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        String newStr="";
        while(!s.isEmpty()){
            char ch = s.pop();
            newStr = newStr+ch;
        }
        return newStr;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(Reverse(str));
    }
}