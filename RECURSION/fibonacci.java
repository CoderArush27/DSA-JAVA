public class fibonacci {
    public static int fibonacciPrint(int n){
        if(n==1)
        return 0;

        if(n==2 || n==3)
        return 1;

        return fibonacciPrint(n-1)+fibonacciPrint(n-2);
    }
    public static void main(String[] args) {
        int a = 7;
        System.out.println(fibonacciPrint(a));
    }
}
