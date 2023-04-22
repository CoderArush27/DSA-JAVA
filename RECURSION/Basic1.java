public class Basic1 {
    public static int power(int x,int n){
        if(n==0)
        return 1;

        return x*power(x, n-1);
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 30;
        System.out.println(power(x,n));
    }
}
