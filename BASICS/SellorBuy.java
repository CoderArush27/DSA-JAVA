public class SellorBuy {
    public static void main(String[] args) {
        int arr[]={100,180,260,310,40,535,695};
        int n = arr.length;
        int cp = arr[0];
       
        for(int i=0;i<n-1;i++){
            int profit = 0;
            int maxProfit = 0;
            cp = arr[i];
            for(int j=i+1;j<n;j++){
            if(arr[j]>cp){
                profit =arr[j]-cp;
                maxProfit = Math.max(maxProfit, profit); 
            }
        }
        System.out.println(maxProfit);
    }
    }
}
