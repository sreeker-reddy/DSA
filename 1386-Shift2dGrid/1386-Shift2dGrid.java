// Last updated: 3/26/2026, 1:49:46 AM
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        int m = grid.length;
        int n = grid[0].length;
        
        while(k>0){
            int temp = grid[m-1][n-1];
            for(int i=0;i<m;i++){
                int currentTemp = grid[i][n-1];
                for(int j=n-1;j>0;j--)
                    grid[i][j] = grid[i][j-1];
                grid[i][0] = temp;
                temp = currentTemp;
               
            }
             k--;
        }
        
    
        
        for(int i=0;i<m;i++){
            List<Integer> test = new LinkedList<Integer>();
            for(int j=0;j<n;j++)
                test.add(grid[i][j]);
            result.add(test);
        }
        return result;
    }
}