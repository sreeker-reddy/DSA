// Last updated: 3/26/2026, 1:47:44 AM
public class Solution {
    public int MaxAscendingSum(int[] nums) {
        int maxSum = nums[0], localSum = nums[0];
        
        for(int i=1;i<nums.Length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                localSum = localSum+nums[i];
            }
            else
            {
                maxSum = Math.Max(maxSum, localSum);
                localSum=nums[i];
            }    
        }
        maxSum = Math.Max(maxSum, localSum);
        
        return maxSum;
    }
}