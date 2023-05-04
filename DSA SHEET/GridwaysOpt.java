public class GridwaysOpt {
    public static int fact(int n){
        if(n==0 || n==1)
            return 1;

        return n*fact(n-1);
    }
    public static int countWays(int n,int m){
        int Ways = fact(n-1+m-1);
        int rep = fact(n-1) * fact(m-1);
        return Ways/rep;
    }
    public static void main(String[] args) {
        int n = 5;
        int m = 4;
       System.out.println(countWays(n, m));
    }
}


//this way is based on basic mathematics using permutation