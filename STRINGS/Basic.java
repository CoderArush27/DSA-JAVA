public class Basic {
    public static void main(String[] args) {
        String str = "CrIcKeT";
       
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            int ascii = c;
            if(ascii>=65 && ascii<=90){
                c = (char) ('a'+(ascii-65));
            }
            else{
                c = (char)('A'+(ascii-97));
            }
            System.out.print(c);
        }
    }
}
