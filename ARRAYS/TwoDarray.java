import java.util.*;
public class TwoDarray {
    public static void print(int arr[][]){
        int r = arr.length;
        int c = arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER ROWS");
        int r = s.nextInt();
        System.out.println("ENTER COLUMNS");
        int c = s.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("ENTER ELEMENTS");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=s.nextInt();
            }
        }
        print(arr);
    }
}
