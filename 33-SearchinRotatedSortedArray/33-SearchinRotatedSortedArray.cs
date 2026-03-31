// Last updated: 3/31/2026, 1:57:30 PM
1public class Solution {
2    public int Search(int[] nums, int target) {
3        int low = 0;
4        int high = nums.Length-1;
5
6        int mid;
7        while(low <= high)
8        {
9            mid = low + (high - low)/2;
10            if(nums[mid] == target)
11                return mid;
12
13            if(nums[low]<=nums[mid])
14            {
15                if(target<nums[mid] && target>=nums[low])
16                {
17                    high = mid-1;
18                }
19                else
20                {
21                    low = mid+1;
22                }
23            }
24            else
25            {
26                if(target>nums[mid] && target<=nums[high])
27                {
28                    low = mid+1;
29                }
30                else
31                {
32                    high = mid-1;
33                }
34            }
35        }
36
37        return -1;
38        
39    }
40}