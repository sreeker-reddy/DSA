// Last updated: 3/26/2026, 1:48:17 AM
public class Solution {
    public int[] Shuffle(int[] nums, int n) {
        int[] result = new int[nums.Length];
        int k=0;
        for(int i=0;i+n<nums.Length;i++)
        {
            result[k++]= nums[i];
            result[k++] = nums[i+n];
        }
        
       
        return result;
    }
}