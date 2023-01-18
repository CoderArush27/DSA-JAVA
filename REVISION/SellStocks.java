public class SellStocks {
    public static int Netprofit(int arr[]){
        int profit = 0;
        int netProfit = 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                profit = arr[i]-arr[i-1];
                netProfit += profit; 
            }
        }
        return netProfit;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(Netprofit(arr));
    }
}
