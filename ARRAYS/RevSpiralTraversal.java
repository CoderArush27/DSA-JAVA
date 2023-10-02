public class RevSpiralTraversal {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,9},
                     {5,6,7,8,10},
                     {1,2,3,4,12},
                     {5,6,7,8,15}};

        int sr = 0;
        int sc = 0;

        int er = arr.length-1;
        int ec = arr[0].length-1;
        
        while(sr<=er && sc<=ec){
        for(int i=er;i>=sr;i--){
            System.out.print(arr[i][ec]+" ");
        }
        for(int i=ec-1;i>=sc;i--){
            System.out.print(arr[sr][i]+" ");
        }
        for(int i=sr+1;i<=er;i++){
            if(sr==er)
            break;
            System.out.print(arr[i][sc]+" ");
        }
        for(int i=sc+1;i<=ec-1;i++){
            if(sc==ec)
            break;
            System.out.print(arr[er][i]+" ");
        }
        sc++;
        sr++;
        ec--;
        er--;
    }
}
}
