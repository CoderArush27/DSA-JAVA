public class CountStairs {
    public static int countWays(int nStairs){
        if(nStairs<0)
        return 0;

        if(nStairs==0)
        return 1;

        int ans = countWays(nStairs-1) + countWays(nStairs-2);

        return ans;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("NUMBER OF WAYS TO REACH THESE STAIRS USING 1 OR 2 CLIMB AT TIME = "+ countWays(n));
    }
}
