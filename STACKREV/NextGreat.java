public class NextGreat {
    public static void nextGreater(int arr[],int x[]){
        boolean flag;
        for(int i=0;i<arr.length-1;i++){
            int ce = arr[i];
            flag = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>ce){
                    x[i]=arr[j];
                    flag = true;
                    break;
                }
            }
            if(flag==false){
                x[i]=-1;
            }
            x[arr.length-1]=-1;
        }
    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int x[] = new int[arr.length];
        nextGreater(arr, x);
        for(int k:x){
            System.out.print(k+" ");
        }
    }
}
