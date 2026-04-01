// Last updated: 4/1/2026, 12:23:51 PM
1public class Solution {
2    public int FindMaxLength(int[] nums) {
3        int maxLength = 0;
4        Dictionary<int,int> dict = new();
5        int sum = 0;
6
7        dict.Add(0,-1);
8
9        for(int i=0; i<nums.Length; i++)
10        {
11            if(nums[i]==0)
12                sum--;
13            else
14                sum++;
15
16            if(!dict.ContainsKey(sum))
17                dict.Add(sum,i);
18
19            maxLength = Math.Max(maxLength, i-dict[sum]);
20        }
21
22        return maxLength;
23    }
24}
25
26/*
27nums = [0,1,1,1,1,0,0]
28
29nums = [1,0,1,0,0,1,1]
30*/
31