

public class MergeSort {
   public void mergeSorting(int a[],int si,int ei){
    if(si>=ei){
        return;
    }
    //work done by recursion
    int mid = si+(ei-si)/2;
    mergeSorting(a, si, mid);
    mergeSorting(a, mid+1, ei);
    merge(a,si,mid,ei);
   }

   public void merge(int a[],int si,int mid,int ei){
    int temp[] = new int[ei-si+1];
    int i = si;         //iterator for left part
    int j = mid+1;      //iterator for right part
    int k=0;            //iterator for temp array

    while(i<=mid && j<=ei){
        if(a[i]<a[j]){
            temp[k] = a[i];
            i++;
        }
        else{
            temp[k] = a[j];
            j++;
        }
        k++;
    } 
    while(i<=mid)
    temp[k++]=a[i++]; 

    while(j<=ei)
    temp[k++]=a[j++];

    //copy temp into original array

    for(k=0,i=si;k<temp.length;i++,k++){
        a[i]=temp[k];
    }
   }

   public void print(int a[]){
    for(int x:a){
        System.out.print(x+" ");
    }
   }
   public static void main(String[] args) {
    MergeSort m = new MergeSort();
    int arr[] = {2,9,8,1,3,6,7};
    int n = arr.length;
    m.mergeSorting(arr, 0,n-1);
    m.print(arr);
   } 
}
