public class Array {
    void print(int arr[]){
        for(int x:arr)
            System.out.print(x+" ");
        System.out.println();
    }
    void reverse(int arr[]){
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    void removeDupli(int arr[]){
        int k = 0;
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[k++] = arr[i];
                count++;
            }
        }
        arr[k++]=arr[arr.length-1];
        count++;
        for(int x=0;x<count;x++){
            System.out.print(arr[x]+" ");
        }
    }

    int kadanes(int arr[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(sum>maxSum){
                maxSum = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,2,2,3,3,3,4,4,5,5,6,6,7};
        int arr3[]={-2, -3, 4, -1, -2, 1, 5, -3};
        
        Array a = new Array();
        a.reverse(arr1);
        a.print(arr1);
        a.removeDupli(arr2);
        System.out.println();
        System.out.println(a.kadanes(arr3));

        }
}