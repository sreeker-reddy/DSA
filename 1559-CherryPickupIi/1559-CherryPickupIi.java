// Last updated: 3/26/2026, 1:48:25 AM
class Solution {
    public int cherryPickup(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][][] cache = new int[row][col][col];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                for(int k=0;k<col;k++){
                    cache[i][j][k] = -1;
                }
            }
        }
        return dp(0,0,col-1,grid,cache);
    }
    
    private int dp(int row, int col1, int col2, int[][] grid, int[][][] cache){
        if(col1<0 || col1>=grid[0].length || col2<0 || col2>=grid[0].length )
            return 0;
        
        if(cache[row][col1][col2]!=-1)
            return cache[row][col1][col2];
        
        int result = 0;
        result+=grid[row][col1];
        if(col1!=col2)
            result+=grid[row][col2];
        
        if(row!=grid.length-1){
            int max = 0;
            for(int newCol1=col1-1; newCol1<=col1+1;newCol1++){
                for(int newCol2=col2-1;newCol2<=col2+1;newCol2++){
                    max=Math.max(max,dp(row+1,newCol1,newCol2,grid,cache));
                }
            }
            result+=max;
        }
        cache[row][col1][col2]=result;
        return result;
    }
}