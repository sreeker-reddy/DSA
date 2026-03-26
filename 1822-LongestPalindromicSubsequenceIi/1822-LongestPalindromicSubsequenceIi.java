// Last updated: 3/26/2026, 1:47:48 AM
class Solution {
    public int longestPalindromeSubseq(String s) {
        
        Integer[][][] memo = new Integer[s.length()][s.length()][27];
        
        
        
        
        return helper_memo(s,0,s.length()-1,memo,26);
      //  return helper_recursive(s,0,s.length()-1,26);
    }
    
    
    private int helper_memo(String s, int i, int j, Integer[][][] memo, int prev){
        if(memo[i][j][prev]!=null)
            return memo[i][j][prev];
        
        if(i>=j){
            memo[i][j][prev] = 0;
            return memo[i][j][prev];
        }
        if(s.charAt(i) - 'a' == prev){
             memo[i][j][prev] =  helper_memo(s,i+1,j,memo,prev);
            return memo[i][j][prev];
        }
        if(s.charAt(j)-'a' == prev){
            memo[i][j][prev] =  helper_memo(s,i,j-1,memo,prev);
            return memo[i][j][prev];
        }
            
        
        if(s.charAt(i) == s.charAt(j)){
            int res = helper_memo(s,i+1,j-1,memo,s.charAt(i)-'a')+2;
            memo[i][j][prev] = res;
            return res;
        }
        int res = Math.max(helper_memo(s,i+1,j,memo,prev), helper_memo(s,i,j-1,memo,prev));
        memo[i][j][prev] = res;
        return res;
        
    }
    
    private int helper_recursive(String s, int i, int j, int prev){
        if(i>=j)
            return 0;
        if(s.charAt(i)-'a' == prev){
            return helper_recursive(s,i+1,j,prev);
        }
        if(s.charAt(j)-'a' == prev)
            return helper_recursive(s,i,j-1,prev);
        if(s.charAt(i) == s.charAt(j)){
            return helper_recursive(s,i+1,j-1,s.charAt(i)-'a')+2;
        }
      
        return Math.max(helper_recursive(s,i+1,j,prev),helper_recursive(s,i,j-1,prev));
    }
}