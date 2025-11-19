public class Stock_buy_sell {
    public static int maxProfit(int[] prices) {
        int maxP = 0;
        int minBuy = prices[0];

        for (int sell : prices) {
            maxP = Math.max(maxP, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }
        return maxP;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 2, 5, 6, 4 };
        System.out.println(maxProfit(prices));
    }
}
