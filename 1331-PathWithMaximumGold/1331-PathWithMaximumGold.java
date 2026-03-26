// Last updated: 3/26/2026, 1:49:58 AM
class Solution {
    int sum;
    boolean[][] visited;
    public int getMaximumGold(int[][] grid) {
         sum = 0;
        visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
             for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]!=0)
                    backtrack(grid,i,j,0);
            }
        }
           
                
        return sum;
    }
       private void backtrack(int[][] grid,int i, int j, int currentSum){
        
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == 0 || visited[i][j])
            return;
        currentSum+=grid[i][j];
           visited[i][j] = true;
        sum = Math.max(sum,currentSum);
        backtrack(grid,i+1,j,currentSum);
        backtrack(grid,i-1,j,currentSum);
        backtrack(grid,i,j+1,currentSum);
        backtrack(grid,i,j-1,currentSum);
           visited[i][j] = false;
    }
}


  
    
 
