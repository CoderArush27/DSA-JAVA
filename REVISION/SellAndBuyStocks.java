public class SellAndBuyStocks {
    public static int profit(int prices[]){
        int profit = 0;
        int n = prices.length;
        int maxProfit = Integer.MIN_VALUE;
        int buyPrice = prices[0];
        int sellPrice = 0;

        for(int i=1;i<n;i++){
            sellPrice = prices[i];
            if(sellPrice > buyPrice){
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
        int prices[]={7,1,5,3,6,4};
        System.out.println(profit(prices));
    }
}
