public class MoveZeros {
//in this program we have to shift all the zeros to the right
    public static void main(String[] args) {
        int arr[]={1,2,0,1,3,4,0,3,0,0,5,6};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]==0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }

}
