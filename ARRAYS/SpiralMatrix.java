public class SpiralMatrix {
    public static void printSpiral(int arr[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
        //top
        for(int i=startCol;i<=endCol;i++){
            System.out.print(arr[startRow][i]+" ");
        }
        //right
        for(int j=startRow+1;j<=endRow;j++){
            System.out.print(arr[j][endCol]+" ");
        }
        //bottom
        for(int i=endCol-1;i>=startCol;i--){
             if(startRow == endRow){
               break;
            }
            System.out.print(arr[endRow][i]+" ");
        }
        //right
        for(int j=endRow-1;j>=startRow+1;j--){
          if(startCol == endCol){
                  break;
          }
            System.out.print(arr[j][startCol]+" ");
        }
        startRow++;
        endRow--;
        startCol++;
        endCol--;
    }
}
    public static void main(String[] args) {
       // int arr[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
     //  int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
       int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        printSpiral(arr);
    }
}
