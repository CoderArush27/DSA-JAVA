public class CountNegative {
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int n = arr.length;


        //finding smallest and largest
        for(int i=0;i<n;i++){
            largest = Math.max(largest,arr[i]);
            smallest = Math.min(smallest,arr[i]);
        }


        //creating array's and calculating frequencies
        int count1[] = new int[largest+1];     //positive

        int s = smallest * (-1);              //negative
        int count2[] = new int[s+1];

        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                count1[arr[i]]++;
            }
            else{
                count2[arr[i]*(-1)]++;
            }
        }

        //sorting
        int j=0;
        for(int i=s;i>=0;i--){
            while(count2[i]>0){
                arr[j]=i*(-1);
                count2[i]--;
                j++;
            }
        }
        for(int i=0;i<count1.length;i++){
            while(count1[i]>0){
                arr[j]=i;
                count1[i]--;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {-1,-2,6,9,8,-5,-7,2,1,1,1,3,1,7,7};
        countingSort(arr);

        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
