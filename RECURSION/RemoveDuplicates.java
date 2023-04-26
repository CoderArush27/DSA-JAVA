import java.util.*;
public class RemoveDuplicates {
    public static void removeDupli(String str,StringBuilder sb,int index,boolean Map[]){
        if(index>=str.length()){
            System.out.println(sb);
            return;
        }
        char c = str.charAt(index);

        if(Map[c-'a']==true){
            removeDupli(str, sb, index+1, Map);
        }
        else{
            Map[c-'a']=true;
            removeDupli(str, sb.append(c), index, Map);
        }
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        boolean Map[]=new boolean[26];
        StringBuilder sb = new StringBuilder("");
        int index = 0;
        removeDupli(str, sb, index, Map);
    }
}
