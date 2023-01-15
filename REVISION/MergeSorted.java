public class MergeSorted {
    public static void merge(int nums1[],int nums2[]){
        int n=nums1.length;
        int m=nums2.length;
        int temp[]=new int[n + m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                temp[k]=nums1[i];
                i++;
            }
            else{
                temp[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            temp[k++]=nums1[i++];
        }
        while(j<m){
            temp[k++]=nums2[j++];
        }

        for(int d:temp){
            System.out.print(d+" ");
        }
    }
    
    public static void main(String[] args) {
        int arr1[]={23,25,33,45,55};
        int arr2[]={9,10,13,16,48};
        merge(arr1, arr2);
    }
}
