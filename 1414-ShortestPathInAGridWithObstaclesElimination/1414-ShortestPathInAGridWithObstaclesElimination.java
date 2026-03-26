// Last updated: 3/26/2026, 1:49:36 AM
class Solution {
    public int shortestPath(int[][] grid, int k) {
        int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
        if(grid.length<=1 && grid[0].length<=1 && k>0)
            return 0;
        Queue<int[]> queue = new LinkedList<>();
        
        queue.add(new int[]{0,0,k});
        int stepCount = 0;
        
        boolean[][][] visited = new boolean[grid.length][grid[0].length][k+1];
        visited[0][0][k] = true;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            
            for(int s = 0; s<size; s++){
                int[] current = queue.poll();
                int row = current[0];
                int col = current[1];
                int obs = current[2];
                if(row == grid.length-1 && col == grid[0].length-1){
                    return stepCount;
                }
                
                for(int i=0;i<directions.length;i++){
                    int nextRow = row + directions[i][0];
                    int nextCol = col + directions[i][1];
                    
                    if(nextRow >=0 && nextCol >=0 && nextRow < grid.length && nextCol < grid[0].length )  {
                        if(grid[nextRow][nextCol] == 0){
                            if(!visited[nextRow][nextCol][obs]){
                                queue.offer(new int[]{nextRow, nextCol,obs});
                                visited[nextRow][nextCol][obs] = true;
                            }
                           
                        }
                         else {
                                if(obs>=1 && !visited[nextRow][nextCol][obs-1]){
                                    queue.offer(new int[]{nextRow, nextCol,obs-1});
                                    visited[nextRow][nextCol][obs-1] = true;
                                }
                            }
                           
                        
                    }
                   
                }
                
            }
            stepCount++;
            
        }
        
        return -1;
        
    }
}



/*
[[0,0,0]
 [1,1,0]
 [0,0,0]
 [0,1,1]
 [0,0,0]]
 
 K = 1
 
 
*/