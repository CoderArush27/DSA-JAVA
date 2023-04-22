public class FibonacciPrint {
    public static int fibPrint(int n){
        if(n==1){
        return 0;
        }

        if(n==1 || n==2){
            return 1;
        }
        return fibPrint(n-1)+fibPrint(n-2);
    }
    public static void main(String[] args) {
        int a = 10;
        for(int i=1;i<=a;i++){
        System.out.print(fibPrint(i)+" ");
        }
    }
}
