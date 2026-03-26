// Last updated: 3/26/2026, 1:49:47 AM
class Solution {
    int flipper = 0;
    public int closedIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count =0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0 && !visited[i][j]){
                    dfs(grid,i,j,visited);
                    if(flipper == 1)
                        flipper = 0;
                    else
                        count++;
                }
            }
        }
        return count;
    }
    
    private void dfs(int[][] grid, int i, int j, boolean[][] visited){
        if(i<0 || i >= grid.length || j<0 || j>=grid[0].length || visited[i][j] || grid[i][j]==1)
            return;
         if(i==0 || j==0 || i==grid.length-1 || j==grid[0].length-1)
            flipper = 1;
        
        
        visited[i][j] = true;
        dfs(grid,i+1,j,visited);
        dfs(grid,i,j+1,visited);
        dfs(grid,i-1,j,visited);
        dfs(grid,i,j-1,visited); 
    
        
    }
}