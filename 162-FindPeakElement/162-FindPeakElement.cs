// Last updated: 3/31/2026, 3:16:09 PM
1public class Solution {
2    public int FindPeakElement(int[] nums) {
3        int low = 0;
4        int high = nums.Length-1;
5        int mid;
6
7        while(low<=high)
8        {
9            mid = low + (high-low)/2;
10            if((mid==0 || nums[mid]>nums[mid-1]) && (mid==nums.Length-1 || nums[mid]>nums[mid+1]))
11            {
12                return mid;
13            }
14
15            if(mid==0 || nums[mid]>nums[mid-1])
16            {
17                low = mid+1;
18            }
19            else
20            {
21                high = mid-1;
22            }
23        }
24
25        return -1;
26    }
27}