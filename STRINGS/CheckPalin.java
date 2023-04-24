public class CheckPalin {
    public static boolean palin(String s){
        int i = 0;
        int j = s.length()-1;
        boolean flag = true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                flag = false;
                return flag;
            }
            flag = true;
            i++;
            j--;
        }
        return flag;
    }
    public static boolean palindrome(String str,int st,int en){
        
        if(st>en)
            return true;
        
        if(str.charAt(st) != str.charAt(en)){
            return false;
        }
        else {
            return palindrome(str, st+1, en-1);
        }
    }
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(palin(s));
    }
}
