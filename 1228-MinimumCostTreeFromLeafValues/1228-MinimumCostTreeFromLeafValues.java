// Last updated: 3/26/2026, 1:50:25 AM
class Solution {
    public int mctFromLeafValues(int[] arr) {
        int[][] dp = new int[arr.length][arr.length];
        
        return helper(arr,dp,0,arr.length-1);
    }
    
    private int helper(int[] arr, int[][] dp, int start, int end){
        if(start == end)
            return 0;
        if(dp[start][end]>0)
            return dp[start][end];
        
        int minValue = Integer.MAX_VALUE;
        
        for(int i=start;i<end;i++){
            int left = helper(arr,dp,start,i);
            int right = helper(arr,dp,i+1,end);
            
            int leftMax = Integer.MIN_VALUE;
            for(int k=start;k<=i;k++)
                leftMax = Math.max(leftMax,arr[k]);
            
            int rightMax = Integer.MIN_VALUE;
            for(int k=i+1;k<=end;k++)
                rightMax = Math.max(rightMax,arr[k]);
            
            int temp = left+right+leftMax*rightMax;
            minValue = Math.min(minValue,temp);
        }
        dp[start][end]= minValue;
        return minValue;
    }
}