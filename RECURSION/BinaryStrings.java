public class BinaryStrings {
    public static void binString(int n,int lastPlace,String s){
        if(n==0){
        System.out.println(s);
        return;
        }
        binString(n-1, 0, s+"0");

        if(lastPlace==0){
        binString(n-1, 1, s+"1");
        }
    }
    public static void main(String[] args) {
        int n = 10;
        binString(n, 0, "");
    };
}
