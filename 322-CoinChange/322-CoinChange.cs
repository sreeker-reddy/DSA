// Last updated: 4/2/2026, 1:02:02 AM
1public class Solution {
2    public int CoinChange(int[] coins, int amount) {
3        int n = coins.Length;
4        int m = amount;
5        int[][] dp = new int[n+1][];
6
7        for(int i=0;i<=n;i++)
8            dp[i] = new int[m+1];
9
10        dp[0][0] = 0;
11
12        for(int j=1;j<=m;j++)
13        {
14            dp[0][j] = m+1;
15        }
16
17        for(int i=1;i<=n;i++)
18        {
19            dp[i][0] = 0;
20        }
21
22        for(int i=1;i<=n;i++)
23        {
24            for(int j=1;j<=m;j++)
25            {
26                if(j<coins[i-1])
27                    dp[i][j] = dp[i-1][j];
28                else
29                    dp[i][j] = Math.Min(dp[i-1][j], 1+dp[i][j-coins[i-1]]);
30            }
31        }
32
33        if(dp[n][m]>=m+1) return -1;
34        return dp[n][m];
35    }
36}