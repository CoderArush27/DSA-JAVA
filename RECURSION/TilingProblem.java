//in this problem i have to calculate the number of ways to place a tiles on floor in order to to fill floor of size 2*n using 2*1 tiles
public class TilingProblem {
    public static int ways(int n){
        //base case
        if(n==0 || n==1)
            return 1;

        //vertically
         int vertical = ways(n-1);
         //horizontally
         int horizontal = ways(n-2);

         int total = vertical + horizontal;

         return total;
    }

public static void main(String[] args) {
    int size = 4;
    System.out.println(ways(size));
}
}
