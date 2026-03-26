// Last updated: 3/26/2026, 1:47:49 AM
class Solution {
    public int stoneGameVII(int[] stones) {
        int[][] dp = new int[stones.length][stones.length];
        
        int[] sum = new int[stones.length+1];
        
        for(int i=0;i<stones.length;i++)
            sum[i+1] = stones[i] + sum[i];
        
        for(int len = 2; len<=stones.length;len++){
            for(int start = 0; start+len-1 < stones.length; start++){
                int end = start + len - 1;
                
                int removeFirst = sum[end+1] - sum[start+1];
                int removeEnd = sum[end] - sum[start];
                dp[start][end] = Math.max(removeFirst - dp[start+1][end], removeEnd- dp[start][end-1]);
                
            }
        }
      
        return dp[0][stones.length-1];
    }
}