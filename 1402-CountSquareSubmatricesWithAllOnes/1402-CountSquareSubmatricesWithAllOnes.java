// Last updated: 3/26/2026, 1:49:41 AM
class Solution {
    public int countSquares(int[][] matrix) {
        return helper_recursive(matrix);
    }
    
   /* private int helper_DP(int[][] matrix){
        
    }
    */
    
    private int helper_recursive(int[][] matrix){
        int count = 0;
        int[][] memo = new int[matrix.length][matrix[0].length];
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==1)
                    count+= helper(matrix,i,j,memo);
            }
        }
        return count;
    }
    
    private int helper(int[][] matrix, int i, int j, int[][] memo){
        if(i<0 || j<0 || i>=matrix.length || j>=matrix[0].length || matrix[i][j]==0)
            return 0;
        if(memo[i][j]!=0)
            return memo[i][j];
        
        int left = helper(matrix,i+1,j,memo);
        int top = helper(matrix,i,j+1,memo);
        int left_top = helper(matrix,i+1,j+1,memo);
        
        int res =  Math.min(left,Math.min(top,left_top))+1;
        return memo[i][j] = res;
    }
}