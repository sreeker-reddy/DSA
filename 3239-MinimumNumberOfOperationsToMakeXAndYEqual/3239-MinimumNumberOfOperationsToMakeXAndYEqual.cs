// Last updated: 3/26/2026, 1:47:25 AM
public class Solution {
    public int MinimumOperationsToMakeEqual(int x, int y) { // x=7, y=5
        if(y >= x)
            return y - x;

        int[] dp = new int[x + 1];
        for(int i = 0; i <= y; i++)
            dp[i] = y - i; // setup base cases till y

        int m5, m11;
        for(int i = y + 1; i <= x; i++)
        {
            dp[i] = dp[i - 1] + 1; // need atleast 1 more step from previous min

            m5 = (5 - i % 5) % 5; // no of increments needed to make i modulo of 5
            m11 = (11 - i % 11) % 11; // no of increments needed to make i modulo of 11

            // increment i to next number which is multiple of 5, divide by 5, then remaining operations needed to transform the result to y (or reach y)
            dp[i] = Math.Min(dp[(i + m5) / 5] + m5 + 1, dp[i]);

            // increment i to next number which is multiple of 5, divide by 5, then reach y
            dp[i] = Math.Min(dp[(i + m11) / 11] + m11 + 1, dp[i]);
        }

        return dp[x];
    }
}