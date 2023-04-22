public class factorial {
    public static int fact(int n){
        if(n==0 || n==1)
            return 1;
        return fact(n-1)*n;
        }
    public static void main(String[] args) {
        int a = 5;
        System.out.println(fact(a));
    }
}
