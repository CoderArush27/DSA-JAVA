import java.util.*;
public class Palindrome {
    public static boolean palin(String s){
        int n = s.length();
        boolean flag = false;
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)==s.charAt(n-1-i)){
                flag = true;
            }
            else{
                return false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String str = s.nextLine();  
        System.out.println(palin(str));
    }
}
