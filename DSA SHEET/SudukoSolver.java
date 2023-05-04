public class SudukoSolver {

public static boolean isSafe(int suduko[][],int row,int col,int digit){
    //same col
    for(int i=0;i<=8;i++){
        if(suduko[i][col]==digit){
            return false;
        }
    }
    //same row
    for(int j=0;j<=8;j++){
        if(suduko[row][j]==digit){
            return false;
        }
    }
    //same grid
    int sr = (row/3)*3;
    int sc = (col/3)*3;

    for(int i=sr;i<sr+3;i++){
        for(int j=sc;j<sc+3;j++){
            if(suduko[i][j]==digit)
                return false;
        }
    }
    return true;
}
public static boolean solve(int suduko[][],int row,int col){
    //base case
    if(row==9){
        return true;
    }

    //work
    int nextCol = col+1;
    int nextRow = row;
    if(col+1 ==9){
        nextRow = row+1;
        nextCol = 0;
    }

    if(suduko[row][col]!=0){
        return solve(suduko,nextRow,nextCol);
    }
    for(int digit=1;digit<=9;digit++){
        if(isSafe(suduko,row,col,digit)){
        suduko[row][col]=digit;
            if(solve(suduko,nextRow,nextCol)){
                return true;
            }
        suduko[row][col]=0;
        }
    }
    return false;
}

public static void print(int suduko[][]){
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            System.out.print(suduko[i][j]+" ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        int suduko[][]={{5,3,0,0,7,0,0,0,0},
                        {6,0,0,1,9,5,0,0,0},
                        {0,9,8,0,0,0,0,6,0},
                        {8,0,0,0,6,0,0,0,3},
                        {4,0,0,8,0,3,0,0,1},
                        {7,0,0,0,2,0,0,0,6},
                        {0,6,0,0,0,0,2,8,0},
                        {0,0,0,4,1,9,0,0,5},
                        {0,0,0,0,8,0,0,7,9}};

        if(solve(suduko, 0, 0)){
            print(suduko);
        }
        else{
            System.out.println("solution do not exist");
        }
    }
}
