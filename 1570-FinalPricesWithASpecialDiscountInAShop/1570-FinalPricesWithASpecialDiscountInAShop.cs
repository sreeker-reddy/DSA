// Last updated: 3/26/2026, 1:48:21 AM
public class Solution {
    public int[] FinalPrices(int[] prices) {
        var length = prices.Count();
            for(int i = 0; i < length; i++)
            {
                for(int j = i + 1; j < length; j++){
            
                if(prices[j] <= prices[i]){
                    prices[i] = prices[i] -prices[j];
                    break;
                }
            }
        }
                return prices;
    }
}
