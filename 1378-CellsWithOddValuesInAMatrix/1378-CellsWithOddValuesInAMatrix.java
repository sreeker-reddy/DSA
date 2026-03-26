// Last updated: 3/26/2026, 1:49:49 AM
class Solution {
    public int oddCells(int n, int m, int[][] indices) {
       int count =0;
        int[][] test = new int[n][m];
        for(int i=0;i<indices.length;i++){
            int row = indices[i][0];
            int col = indices[i][1];
            for(int j=0;j<m;j++){
                test[row][j] ++;
            }
            for(int k=0;k<n;k++){
                test[k][col]++;
            }
          
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               // System.out.println(test[i][j]);
                if(test[i][j]%2!=0){
                    count+=1;
                }
            }
        }
        return count;
    }
}