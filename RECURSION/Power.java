public class Power {
    public static int pow(int x,int n){
        if(n==0)
        return 1;

        if(n==1)
        return x;

        int ans = pow(x,n/2);

        if(n%2==0)
        return ans*ans;

        else
        return x*ans*ans;
    }
    public static void main(String[] args) {
        int a=2;
        int n=10;
        System.out.println(pow(a, n));
    }
}

