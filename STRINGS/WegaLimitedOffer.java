import java.util.*;

public class WegaLimitedOffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        scanner.close();
        
        Arrays.sort(prices); // Sort the prices in ascending order
        int revenue = 0;
        for (int i = n-1; i >= 0; i--) {
            int numOfOffers = n - i;
            int offerPrice = prices[i];
            int offerRevenue = Math.min(numOfOffers, offerPrice) * offerPrice;
            revenue += offerRevenue;
            if (numOfOffers >= offerPrice) {
                break; // No need to process remaining offers since they are all sold out
            }
        }
        System.out.println(revenue);
    }
}
