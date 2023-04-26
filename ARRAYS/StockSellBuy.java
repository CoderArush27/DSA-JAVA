public class StockSellBuy {
    public static int profit(int arr[]){
        int profit = Integer.MIN_VALUE;           //BECAUSE I NEED THIS THE HIGHEST
        int buyPrice = Integer.MAX_VALUE;           //AND THIS AS LOWEST
        int maxProfit = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sellPrice = arr[i];
            if(sellPrice>buyPrice){
                profit = sellPrice-buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = sellPrice;
            }
        }
        return maxProfit;

    }
    public static void main(String[] args) {
        int arr[]={100,180,260,310,40,535,695};
        System.out.println("MAXIMUM PROFIT = "+profit(arr));
    }
}
