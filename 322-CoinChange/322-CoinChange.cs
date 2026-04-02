// Last updated: 4/2/2026, 1:16:09 AM
1public class Solution {
2
3    private int?[][] memo;
4
5    public int CoinChange(int[] coins, int amount) {
6
7        memo = new int?[coins.Length+1][];
8        for(int i=0;i<=coins.Length;i++)
9            memo[i] = new int?[amount+1];
10
11        int result = helper(coins, 0, amount);
12
13        if(result>=int.MaxValue-1)
14            return -1;
15        else
16            return result;
17    }
18
19    private int helper(int[] coins, int idx, int amount)
20    {
21        //base case
22        if(amount<0 || idx==coins.Length) return int.MaxValue-1;
23        if(amount==0) return 0;
24
25        //logic
26        if(memo[idx][amount].HasValue)
27            return memo[idx][amount].Value;
28
29        //not choose
30        int case1 = helper(coins, idx+1,amount);
31        //choose
32        int case2 = 1 + helper(coins, idx, amount-coins[idx]);
33
34        memo[idx][amount] = Math.Min(case1, case2);
35        return memo[idx][amount].Value;
36    }
37}