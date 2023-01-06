class RightShift{
    public static void print(int arr[]) {
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr1[] = new int[5];
        int pos = 2;
        for(int i=0;i<5;i++){
            arr1[(i+pos)%5]=arr[i];
        }
        print(arr1);
    }
}