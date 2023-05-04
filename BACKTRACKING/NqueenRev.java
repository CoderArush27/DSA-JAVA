
public class NqueenRev {
    public static boolean isSafe(char board[][],int row,int col){
        //same col
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q')
                return false;  
        }
        //left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q')
                return false;   
        }
        //right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q')
                return false;
        }
        return true;
    }


    public static boolean nQueenSolve(char board[][],int row){
        //base case
        if(row == board.length){
            return true;
        }
        //work
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                if(nQueenSolve(board, row+1)){
                    return true;
                }
            }
                board[row][j]='0';
        }
        return false;
    }

    public static void print(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        //intialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='0';
            }
        }
        if(nQueenSolve(board, 0))
            print(board);
        else
            System.out.println("SOLUTION DO NOT EXIST"); 
    }
}
