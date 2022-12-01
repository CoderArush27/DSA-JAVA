

public class binomialCoef {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f = f * i;
       }
       return f;
    }
   public static void main(String[] args) {
    int n=5;
    int r=2;
    int nf = factorial(n);
    int rf = factorial(r);
    int nmr = factorial(n-r);

    int bCoef = nf/(rf*nmr);
    System.err.println(bCoef);
   } 
}
