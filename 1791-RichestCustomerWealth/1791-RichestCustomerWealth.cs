// Last updated: 3/26/2026, 1:47:51 AM
public class Solution {
    public int MaximumWealth(int[][] accounts) {
        int max = 0;
        
        for(int i=0;i<accounts.Length;i++)
        {
            int tempSum=0;
            for(int j=0;j<accounts[i].Length;j++)
            {
                tempSum+=accounts[i][j];
            }
            
            max = Math.Max(max,tempSum);
        }
        
        return max;
    }
}