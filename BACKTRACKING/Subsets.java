
public class Subsets {
    public static void subset(String str,int i,String ans){
        //base case
        if(i==str.length()){
        if(ans.length()==0){
            System.out.print("null"+" ");
            return;
        }
        else{
            System.out.print(ans+" ");
            return;
        }
    }
        //work
        char c = str.charAt(i);
        subset(str, i+1, ans+c);   //include
        subset(str, i+1, ans);     //exclude

    }
    public static void subsetBuilder(String str,int i,StringBuilder ans1){
        //error
        //base case
        if(i==str.length()){
            if(ans1.length()==0){
                System.out.print("null"+" ");
                return;
            }
            else{
                System.out.print(ans1+" ");
                return;
            }
        }

        //work
        char c = str.charAt(i);
        subsetBuilder(str, i+1, ans1);//exclude
        subsetBuilder(str, i+1, ans1.append(c));  //include
        ans1.delete(0, i);
        
        
    }
    public static void main(String[] args) {
        String str = "abc";
        String str1 = "ABC";
        String ans = "";
        StringBuilder ans1 = new StringBuilder("");
        subset(str, 0, ans);
        System.out.println();
        subsetBuilder(str1, 0, ans1);
    }
}
