// Last updated: 4/2/2026, 12:59:16 AM
1public class Solution {
2    public int CoinChange(int[] coins, int amount) {
3        int m = amount;
4        int n = coins.Length;
5
6        int[][] dp = new int[n+1][];
7
8        for(int i=0;i<dp.Length;i++)
9        {
10            dp[i] = new int[m+1];
11        }
12        dp[0][0]=0;
13        for(int i=1;i<=m;i++)
14        {
15            dp[0][i] = m+1;
16        }
17
18        for(int i=1;i<=n;i++)
19        {
20            dp[i][0] = 0;
21        }
22
23        for(int i = 1;i<=n;i++)
24        {
25            for(int j=1;j<=m;j++)
26            {
27                if(j<coins[i-1])
28                    dp[i][j] = dp[i-1][j];
29                else
30                    dp[i][j] = Math.Min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
31            }
32        }
33
34        if(dp[n][m]>m) return -1;
35        else return dp[n][m];
36    }
37}