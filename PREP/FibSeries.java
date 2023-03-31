public class FibSeries {
    static int a = 0;   //first term 0
    static int b = 1;
    static int c = 0;
    public static void fibSeries(int n){
       if(n>0){
        c = a + b;
        a = b;
        b = c;
        System.out.print(c+" ");
       fibSeries(n-1);
       } 
    }
    public static void main(String[] args) {
        int n=5;
        fibSeries(n);
    }
}
