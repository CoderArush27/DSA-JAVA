

public class Merge {
    public static void print(int arr[]){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i=si;   //left
        int j=mid+1; //right
        int k=0;

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
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(int s=0,t=si;s<temp.length;s++,t++){
            arr[t]=temp[s];
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,9,9,19,9,7,6,1,3,2,5,6,4,5,8,1,7};
        mergeSort(arr, 0,arr.length-1);
        print(arr);
    }
}
