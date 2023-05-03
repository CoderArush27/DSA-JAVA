public class NqueenBest {
    public static void print(char board[][]){
        System.out.println("-----chess board------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][],int row,int col){
        //vertically
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean nRows(char board[][],int row){
        //base
        if(row == board.length){
            return true;
        }
        //work
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(nRows(board, row+1)){
                    return true;
                }
            }
                board[row][j]='x';
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][]=new char[n][n];

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='X';
            }
        }
        
        if(nRows(board, 0)){
            print(board);
        }
        else{
            System.out.println("NO SOLUTION EXIST");
        }
    }
}
