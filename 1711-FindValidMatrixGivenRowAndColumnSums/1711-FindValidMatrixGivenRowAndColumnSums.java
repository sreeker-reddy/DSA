// Last updated: 3/26/2026, 1:48:05 AM
class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] matrix = new int[rowSum.length][colSum.length];
        int i=0;
        int j=0;
        int row = rowSum.length;
        int col = colSum.length;
        while(i<row && j<col){
            int min = Math.min(rowSum[i],colSum[j]);
            matrix[i][j] = min;
            rowSum[i] = Math.abs(rowSum[i]-min);
            colSum[j] = Math.abs(colSum[j]-min);
            if(rowSum[i]==0)
                i++;
            else
                j++;
        }
        return matrix;
    }
}