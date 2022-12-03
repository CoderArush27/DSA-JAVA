public class diagonalSum {
    public static int diaSum(int arr[][]){
        int r = arr.length;
        int c = arr[0].length;
        int sum = 0;
        // for(int i=0;i<r;i++){ //o[n^2] 
        //     for(int j=0;j<c;j++){
        //         if(i==j){
        //             sum = sum + arr[i][j];
        //         }
        //         else if(i+j == arr.length-1){
        //             sum=sum+arr[i][j];
        //         }
        //     }
        // }
        for(int i=0;i<arr.length;i++){  //o[n]
            sum += arr[i][i];
            if(i!= arr.length-i-1){         //simple understanding j!=i
            sum += arr[i][arr.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diaSum(arr));
    }
}
