public class GridWays {
    public static int countWays(int rows,int cols,int i,int j){
        //base case
        if(i==rows-1 && j==cols-1){
            return 1;
        }
        else if(i==rows || j==cols){
            return 0;
        }
        int right = countWays(rows, cols,i,j+1);
        int down = countWays(rows,cols,i+1,j);

        return right+down;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println("Total ways = "+countWays(m, m, 0, 0));
    }
}
