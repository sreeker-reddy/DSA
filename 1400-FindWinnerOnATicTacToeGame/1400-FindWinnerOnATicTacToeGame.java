// Last updated: 3/26/2026, 1:49:42 AM
class Solution {
    int n = 3;
    public String tictactoe(int[][] moves) {
        if(moves.length < n*2-1) return "Pending";
        
        int[] rowSum = new int[n];
        int[] colSum = new int[n];
        int diagSum = 0, revDiagSum = 0;
        
        for(int i=0;i<moves.length;i++){
            int index = i%2;
            int curr = index == 0 ? 1 : -1;
            int row = moves[i][0];
            int col = moves[i][1];
            rowSum[row] +=curr;
            colSum[col]+=curr;
            if(row == col)
                diagSum += curr;
            if(row+col == (n-1))
                revDiagSum+=curr;
            if(Math.abs(rowSum[row]) == n || Math.abs(colSum[col]) == n || Math.abs(diagSum) == n || Math.abs(revDiagSum) == n){
                return index ==0 ?"A" : "B";
            }
        }
        return (moves.length == n*n) ? "Draw" : "Pending";
    }
}

