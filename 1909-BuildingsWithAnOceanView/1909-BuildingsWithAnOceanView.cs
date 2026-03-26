// Last updated: 3/26/2026, 1:47:45 AM
public class Solution {
    public int[] FindBuildings(int[] heights) {
        if(heights.Length==0)
            return new int[0];

        List<int> result = new List<int>();

        int maxHeight = heights[heights.Length-1];
        result.Add(heights.Length-1);
        for(int i=heights.Length-2;i>=0;i--)
        {
            if(heights[i]>maxHeight)
                result.Add(i);
            
            maxHeight = Math.Max(maxHeight, heights[i]);
        }
        result.Reverse();

        return result.ToArray();
    }
}