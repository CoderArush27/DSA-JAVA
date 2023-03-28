public class RemoveDuplicates {
    //removing duplicates from sorted
    public int removeDupli(int arr[]){
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                arr[i-count]=arr[i];
            }
        }
        return arr.length-count;
    }

    public void print(int arr[],int x){
        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        RemoveDuplicates d = new RemoveDuplicates();
        int arr[]={0,0,1,1,2,2,2,3,3,3,4,4};
        int c = d.removeDupli(arr);
        d.print(arr, c);
        
    }
}
