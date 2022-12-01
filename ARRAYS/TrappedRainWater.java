public class TrappedRainWater {
    
    public static int TRW(int arr[]){
        int len=arr.length;
        int width=1;
        if(len == 1 || len == 2){
            return 0;
        }
        else{
        //left max boundary
        int L[]=new int[len];
        L[0]=arr[0];
       int mxl = L[0];
        for(int i=1;i<len;i++){
            L[i]=Math.max(mxl,arr[i]);
            mxl = L[i];
        }
      
       //right max boundary
       int R[] = new int[len];
       R[len-1]=arr[len-1];
       int mxr = R[len-1];
       for(int i=len-2;i>=0;i--){
        R[i]=Math.max(mxr,arr[i]);
        mxr = R[i];
       }
       
       //Water stored
       int Tw=0;
       for(int i=0;i<len;i++){
        Tw += ( (Math.min(L[i],R[i]))-arr[i] )*width;
       }
       return Tw;
    }
}
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.print("Rainwater Trapped = "+TRW(arr));
    }
}
