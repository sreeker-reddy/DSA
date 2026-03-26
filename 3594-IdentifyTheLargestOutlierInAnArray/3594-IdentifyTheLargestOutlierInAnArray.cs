// Last updated: 3/26/2026, 1:47:24 AM
public class Solution {
    public int GetLargestOutlier(int[] nums) {
        int sum = nums.Sum();
        Console.WriteLine("sum : " + sum);
        int outlier = Int32.MinValue;
        Dictionary<int,int> dict = new();

        foreach(int num in nums)
        {
            if(!dict.ContainsKey(num))
                dict.Add(num,1);
            else
                dict[num]++;
        }

        for(int i=0;i<nums.Length;i++)
        {
            int o = sum-2*nums[i];
            if(dict.ContainsKey(o) && (nums[i]!=o || dict[o]>1))
                outlier = Math.Max(outlier,o);
        }

        return outlier;
    }
}