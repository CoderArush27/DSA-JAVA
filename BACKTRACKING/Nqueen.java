public class Nqueen {

    public static void print(char board[][]){
        System.out.println("---chess board---");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][],int row,int col){
        //vertically upwards
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
//N rows mein N Queens ko place krna hia 
static int count = 0;
    public static void nRows(char board[][],int row){
        if(row == board.length){
            print(board);
            return;
        }
        //work
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
            board[row][j]='Q';
            nRows(board, row+1);//function call
            board[row][j]='x';//backtracking step
            }
        }
    }
    public static void main(String[] args) {
        int n = 8;
        char board[][]=new char[n][n];
        //inialize
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++){
                board[i][j]='x';
            }
        }
        nRows(board, 0);
    }
}
