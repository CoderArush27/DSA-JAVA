public class sortedSum {
    public static boolean stairCase(int arr[][],int key){
        //using the method starting from 0,m-1
        int row=0,col = arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col] == key){
                System.out.println("KEY FOUND AT ("+row+","+col+")");  
                return true;
                 }
                 else if(key > arr[row][col]){
                    row++;
                 }
                 else{
                    col--;
                 }
        }
        System.out.println("KEY NOT FOUND");
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},
                    {15,25,35,45},
                {29,31,37,48},
            {33,36,39,50}};
        int key = 69;
        stairCase(arr, key);
    }
}
