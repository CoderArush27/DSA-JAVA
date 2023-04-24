public class MergeSorting {

    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = (si+ei)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){
        int i=si;
        int j=mid+1;
        int k=0;
        int temp[]=new int[ei-si+1];
        
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            
            else{
                temp[k]=arr[j];
                j++;

            }
            k++;
        }
        while(i<=mid)
            temp[k++]=arr[i++];
        while(j<=ei)
            temp[k++]=arr[j++];

        for(int a=0,t=si;a<temp.length;a++,t++){
            arr[t]=temp[a];
        }
    }
    public static void print(int arr[]){
        for(int x:arr)
            System.out.print(x+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,1,9,6,3,7,10};
        mergeSort(arr, 0, arr.length-1);
        print(arr);
    }
}
