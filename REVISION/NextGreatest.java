public class NextGreatest {
    public static void nextGreater(int arr[]){
        int n = arr.length;
        boolean flag;
        int i,j;
        for(i=0;i<n;i++){
            flag=false;
            for(j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    flag = true;
                    break;
                }
            }
            if(flag==true)
                System.out.println(arr[i]+","+arr[j]);
            else
                System.out.println(arr[i]+","+"-1");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        nextGreater(arr);
    }
}
