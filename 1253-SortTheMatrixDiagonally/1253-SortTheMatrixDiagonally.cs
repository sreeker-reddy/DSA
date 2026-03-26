// Last updated: 3/26/2026, 1:50:20 AM
public class Solution {
    public int[][] DiagonalSort(int[][] mat) {
        Dictionary<int,List<int>> map = new Dictionary<int,List<int>>();
        
        for(int i=0;i<mat.Length;i++)
        {
            for(int j=0;j<mat[i].Length;j++)
            {
                if(!map.ContainsKey(i-j))
                    map.Add(i-j,new List<int>());
                
                map[i-j].Add(mat[i][j]);
            }
        }
        
        foreach(var key in map.Keys)
            map[key].Sort();
        
        for(int i=0;i<mat.Length;i++)
        {
            for(int j=0;j<mat[i].Length;j++)
            {
                int val = map[i-j][0];
                mat[i][j] = val;
                
                map[i-j].RemoveAt(0);
            }
            
        }
        
        return mat;
    }
}