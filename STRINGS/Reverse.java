public class Reverse {
    public static String revWords(String s){
        int l = s.length();
        String result = "";
        int i = 0;

        while(i<l){
            //for space in front
            while(i<l && s.charAt(i)==' ')
                i++;
            int j=i+1;
            while(j<l && s.charAt(j)!=' ')
                j++;
            String sub = s.substring(i, j);

            if(result.length()==0)
                result = sub + result;
            else
                result = sub + " "+result;
            i=j+1;
        }
        return result;
    }
    public static void main(String[] args) {
        String S = "       i love you isha";
        System.out.println(revWords(S));
    }
}
