

public class Counting {
    public static void print(int arr[]){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    public static void countingSort(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max, arr[i]);
        }
        int count[] = new int[max+1];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j++]=i;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,1,2,1,3,4,3,4,2,2,1,2};
        countingSort(arr);
        print(arr);
    }
}
