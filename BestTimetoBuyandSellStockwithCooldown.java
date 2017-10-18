package leetcode;

public class BestTimetoBuyandSellStockwithCooldown {
	public static int maxProfit(int[] prices) {
        int[] rest = new int[prices.length+1];
        int[] sell = new int[prices.length+1];
        int[] buy = new int[prices.length+1];
        buy[0] = -prices[0];
        for(int i = 1; i <= prices.length; i++){
        	sell[i] = Math.max(sell[i-1], buy[i-1] + prices[i-1]);
        	buy[i] = Math.max(buy[i-1], rest[i-1] - prices[i-1]);
        	rest[i] = Math.max(rest[i-1], Math.max( sell[i-1], buy[i-1]));
        }
        return sell[prices.length];
    }
	public static void main(String[] args) {
		int[] prices = {1,2,3,0,2};
		System.out.println(maxProfit(prices));
	}
}
