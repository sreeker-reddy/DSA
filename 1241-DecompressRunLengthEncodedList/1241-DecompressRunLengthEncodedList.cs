// Last updated: 3/26/2026, 1:50:23 AM
public class Solution {
    public int[] DecompressRLElist(int[] nums) {
        int n = 0;
        
        for(int i=0;i<nums.Length;i=i+2)
            n+=nums[i];
        
        int[] result = new int [n];
        int index = 0;
        
        for(int i=0;i<nums.Length;i=i+2)
        {
            for(int j=0;j<nums[i];j++)
            {
                result[index++] = nums[i+1];
            }
        }
        
        return result;
    }
}