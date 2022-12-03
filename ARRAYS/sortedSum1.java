public class sortedSum1 {
    public static boolean stairCase(int arr[][],int key){
        int row=arr.length-1,col=0;
        while(row>=0 && col<arr.length){
            if(arr[row][col]==key){
                System.out.println("KEY FOUND AT ("+row+","+col+")");  
                return true;
            }
            else if(arr[row][col]>key){
                row--;
            }
            else{
                col++;
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
        int key = 36;
        stairCase(arr, key);
    }
}
