public class CountInversions {
    public static int mergeSortCount(int arr[],int si,int ei){
        int count = 0;
        if(si<ei){
            int mid = (si+ei)/2;
            count = count + mergeSortCount(arr, si, mid);
            count = count + mergeSortCount(arr, mid+1, ei);

            count = count + mergeCount(arr, si, mid, ei);
        }
        return count;
    }
    public static int mergeCount(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        int swaps=0;

        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                swaps =mid+1;
                j++;
            }
            k++;
        }
        while(i<=mid){
        temp[k++]=arr[i++];
        }

        while(j<=ei){
        temp[k++]=arr[j++];
        }

        return swaps;
    }
    public static void main(String[] args) {
        int arr[]={1,20,6,4,5};
        System.out.println(mergeSortCount(arr, 0, arr.length-1));
    }
}
