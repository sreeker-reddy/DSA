// Last updated: 3/26/2026, 1:48:01 AM
public class Solution {
    public int NumSpecial(int[][] mat) {
        
        int count=0;
        
        for(int i=0;i<mat.Length;i++)
        {
            for(int j=0;j<mat[0].Length;j++)
            {
                if(mat[i][j]==1)
                {
                    if(GetRowSum(mat,i)==1 && GetColumnSum(mat,j)==1)
                        count++;
                }
            }
        }
        return count;
    }
    
    int GetRowSum(int[][] mat, int row)
    {
        int rowSum = 0;
        for(int j=0;j<mat[0].Length;j++)
            rowSum+=mat[row][j];
        
        return rowSum;
    }
    
    int GetColumnSum(int[][] mat,int column)
    {
        int columnSum=0;
        
        for(int i=0;i<mat.Length;i++)
            columnSum+=mat[i][column];
        
        return columnSum;
    }
}