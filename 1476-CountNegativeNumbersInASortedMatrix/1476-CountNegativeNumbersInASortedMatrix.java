// Last updated: 3/26/2026, 1:49:18 AM
class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            int j = grid[i].length-1;
            
            while(j>=0 && grid[i][j] <0){
                count++; j--;
            }
        }
        return count;
    }
}