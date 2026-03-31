// Last updated: 3/31/2026, 2:55:43 PM
1public class Solution {
2    public int FindMin(int[] nums) {
3        int low = 0, high = nums.Length-1;
4
5        while(low<=high)
6        {
7            if(nums[low]<=nums[high]) return nums[low];
8
9            int mid = low+(high-low)/2;
10            
11            if((mid == 0 || nums[mid] < nums[mid - 1]) &&  nums[mid] < nums[mid + 1])
12            {
13                return nums[mid];
14            }
15            else
16            {
17                if(nums[low]<=nums[mid])
18                {
19                    low = mid+1;
20                }
21                else
22                {
23                    high = mid-1;
24                }
25            } 
26        }
27        return -1;
28    }
29}