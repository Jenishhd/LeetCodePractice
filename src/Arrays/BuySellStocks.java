package Arrays;

public class BuySellStocks {
    public static void main(String[] args) {

    }

    //MY APPROACH
    public static int getMaxProfit(int[] prices) {
        int lowestPrice = prices[0];
        int highestPrice = 0;

        for(int i = 0; i < prices.length; i++) {
            if(lowestPrice > prices[i]) {
                lowestPrice = i;
            }
        }
        if(lowestPrice == prices[prices.length - 1]){return 0;}

        for(int i = lowestPrice; i < prices.length; i++) {
            if(highestPrice < prices[i]) {
                highestPrice = i;
            }
        }
        return prices[highestPrice] - prices[lowestPrice];

    }

    //OPTIMIZED METHOD
    public static int maxProfitOptimized(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minprice) {
                minprice = prices[i];
            }
            else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}
