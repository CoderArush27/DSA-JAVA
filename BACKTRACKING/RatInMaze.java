public class RatInMaze {
    public static boolean isSafe(int maze[][],int ans[][],int row,int col){
        //right
        if(row>=0 && row<maze.length && maze[row][col]==1){
            return true;
        }
        if(col>=0 && col<maze.length && maze[row][col]==1){
            return true;
        }
        return false;
    }

    public static boolean ways(int maze[][],int ans[][],int i,int j){
        if(i==maze.length-1 && j==maze.length-1){
            maze[i][j]=1;
            return true;
        }
        if(isSafe(maze,ans,i,j)){
            maze[i][j]=1;
            //moving in down direction
            if(ways(maze,ans,i+1,j)){
                return true;
            }
            //moving in right direction if mocing down do no give us the result
            if(ways(maze,ans,i,j+1)){
                return true;
            }
            ans[i][j]=0;
            return false;
        }
        return false;
    }

    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int maze[][]={{1,0,0,0},
                      {1,1,0,1},
                      {1,1,0,0},
                      {0,1,1,1}};
        int ans[][] = new int[n][n];
        if(ways(maze, ans, 0, 0)){
            print(ans);
        }
        else
        System.out.println("SOLUTION DO NOT EXIST");
    }
}
