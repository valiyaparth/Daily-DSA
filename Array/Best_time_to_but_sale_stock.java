//121. Best Time to Buy and Sell Stock
public class Best_time_to_but_sale_stock {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            profit = Math.max(profit, prices[i]-buyPrice);
        }
        return profit;
    }
}
