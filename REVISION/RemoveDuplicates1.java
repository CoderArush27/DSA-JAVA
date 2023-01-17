public class RemoveDuplicates1 {
    public static void dupli(int arr[]){
        int k=0;
        int count=0;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[k++]=arr[i];
                count++;
            }
        }
        arr[k++]=arr[n-1];

        for(int i=0;i<=count;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("length of an array = "+(count+1));
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3,3,3,4,4,4,5,6,6,7};
        dupli(arr);
    }
}
