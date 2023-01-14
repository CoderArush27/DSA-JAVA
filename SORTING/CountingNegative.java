

public class CountingNegative {

    public static void print(int arr[]){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    public static void countingNegative(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }


        int countP[]= new int[max+1];
        int countN[] = new int[(min*-1)+1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                countP[arr[i]]++;
            }
            else{
                countN[arr[i]*(-1)]++;
            }
        }
        int j=0;
        for(int i=countN.length-1;i>0;i--){
            while(countN[i]>0){
                arr[j++]=i*-1;
                countN[i]--;
            }
        }

        for(int i=0;i<countP.length;i++){
            while(countP[i]>0){
                arr[j++]=i;
                countP[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={-7,6,-3,-5,-3,-7,1,6,7,2,3,2,2,7,8,9,-10};
        countingNegative(arr);
        print(arr);
    }
}
