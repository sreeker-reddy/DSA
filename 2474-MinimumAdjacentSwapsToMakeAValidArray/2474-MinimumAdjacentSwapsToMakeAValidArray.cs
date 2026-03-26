// Last updated: 3/26/2026, 1:47:32 AM
public class Solution {
    public int MinimumSwaps(int[] nums) {
        int max = Int32.MinValue;
        int min = Int32.MaxValue;
        
        int maxPosition = -1;
        int minPosition = -1;

        for(int i=0;i<nums.Length;i++)
        {
            if(nums[i]>=max)
            {
                maxPosition = i;
                max = nums[i];
            }

            if(nums[i]<min)
            {
                minPosition = i;
                min = nums[i];
            }
        }
        if(maxPosition<minPosition)
        {
            return minPosition - 0 + nums.Length - 1 - maxPosition - 1;
        }
        if(maxPosition>=minPosition)
        {
            return minPosition - 0  + nums.Length - 1 - maxPosition;
        }

        return 0;
    }
}