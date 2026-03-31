// Last updated: 3/31/2026, 3:01:50 PM
1public class Solution {
2    public int FindMin(int[] nums) {
3        int low = 0;
4        int high = nums.Length-1;
5        int mid;
6        
7        while(low<=high)
8        {
9            if(nums[low]<=nums[high])
10            {
11                return nums[low];
12            }
13
14            mid = low + (high-low)/2;
15            if((mid==0 || nums[mid]<nums[mid-1]) && (nums[mid]<nums[mid+1]))
16            {
17                return nums[mid];
18            }
19            else
20            {
21                if(nums[mid]>=nums[low])
22                {
23                    low = mid+1;
24                }
25                else
26                {
27                    high = mid-1;
28                }
29            }
30        }
31
32        return -1;
33    }
34}