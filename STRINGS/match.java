public class match {
    public static void main(String[] args) {
        String a = "ABC";
        String b = "DEF";

        for(int i=0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                System.out.print(b.charAt(j)+" "+a.charAt(i));
            }
            System.out.println();
        }
    }
}
