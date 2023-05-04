public class GridWays{
    public static int countWays(int i,int j,int n,int m){
        //base case
        if(i== n-1 && j==m-1){
            return 1;
        }
        else if(i==n || j==m){
            return 0;
        }
        //work
        int right = countWays(i, j+1, n, m);
        int down = countWays(i+1, j, n, m);

        return right + down;
    }
    public static void main(String[] args) {
        int n = 4,m=5;
        System.out.println("NUMBER OF WAYS = "+countWays(0, 0, n, m));
    }
}