import java.util.*;
public class Compression {
    public static String compress(String str){
        StringBuilder s = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
        Integer count=1;  //we took it as an object of integer class because toString methods converts only objects into strings and we have to add this count to string so we took
        while(i<str.length()-1 && (str.charAt(i)==str.charAt(i+1))){
            count++;
            i++;
        }
        s = s.append(str.charAt(i));
        if(count > 1){
            s = s.append(count.toString());
        }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String str = "aaabcd";
        System.out.println(compress(str));
    }
}
