// Last updated: 3/26/2026, 1:50:22 AM
class Solution {
    //int len = 0;
    public int longestCommonSubsequence(String text1, String text2) {
        //return helper(text1,text2,0,0);
        
        return helper_DP(text1,text2);
        
    }
    
    
    private int helper_DP(String text1,String text2){
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        
        for(int i=1;i<=text1.length();i++)
        {
            for(int j=1;j<=text2.length();j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[text1.length()][text2.length()];
        
    }
    
    
    private int helper(String text1, String text2, int index1,int index2){
        if(index1==text1.length() || index2 == text2.length())
            return 0;
        
        if(text1.charAt(index1) == text2.charAt(index2))
            return 1+helper(text1,text2,index1+1,index2+1);
        
        return Math.max(helper(text1,text2,index1+1,index2), helper(text1,text2,index1,index2+1));
    }
}