public class SubsetRev {
    public static void subsets(String str,String ans,int index){
        //base case
        if(index==str.length()){
            if(ans.length()==0){
                System.out.println(null + " ");
                return;
            }
            else{
                System.out.println(ans);
                return;
            }
        }
        //work
        char c = str.charAt(index);
        subsets(str, ans+c, index+1);
        subsets(str, ans, index+1);
    }
    public static void main(String[] args) {
        String str = "ABC";
        String ans = "";
        subsets(str, ans, 0);
    }
}

