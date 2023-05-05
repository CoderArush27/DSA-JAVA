public class PermutationRev {
    public static void permute(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //work
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            permute(newStr, ans+c);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        String ans = "";
        permute(str, ans);
    }
}
