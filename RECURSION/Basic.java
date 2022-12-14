
public class Basic {
    public static int rec(int a){
        if(a==0){
            return 1;
        }
        System.out.println(a);
        return rec(a-1)+a;

    }
    public static void main(String[] args) {
       System.out.println(rec(5));
    }
}
