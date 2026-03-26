// Last updated: 3/26/2026, 1:49:14 AM
public class Solution {
    public int[] SmallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.Length];
        
        int[] count = new int[101];
        
        for(int i=0;i<nums.Length;i++)
            count[nums[i]]++;
        
        for(int i=0;i<nums.Length;i++)
            for(int j=0;j<nums[i];j++)
              result[i]+=count[j];
        
        return result;
        
    }
}