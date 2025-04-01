// Time Complexity: O(n) where n is the number of prices
// Space Complexity: O(1)

class BuySellStock {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }

        int prev = 0;
        int profit = 0;
        int totalProfit = 0;
        for(int i = 0; i < prices.length; i++){
            profit = prices[i] - prices[prev];

            if(profit > 0){
                totalProfit += profit;
            }
            prev = i;
        }

        return totalProfit;
    }
}
