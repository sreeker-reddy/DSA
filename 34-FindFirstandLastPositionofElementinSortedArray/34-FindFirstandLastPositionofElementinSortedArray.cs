// Last updated: 3/31/2026, 2:39:02 PM
1public class Solution {
2    public int[] SearchRange(int[] nums, int target) {
3        return new int[2]{getFirst(nums, target), getLast(nums, target)};
4    }
5
6    private int getFirst(int[] nums, int target)
7    {
8        int first = -1;
9        int low = 0;
10        int high = nums.Length-1;
11
12        int mid;
13
14        while(low<=high)
15        {
16            mid = low + (high-low)/2;
17
18            if(nums[low]<=target && target<=nums[mid])
19            {
20                if(nums[mid]==target)
21                {
22                    first = mid;
23                }
24                high = mid-1;
25            }
26            else
27            {
28                low = mid+1;
29            }
30        }
31
32        return first;
33    }
34
35    private int getLast(int[] nums, int target)
36    {
37        int last = -1;
38        int low = 0;
39        int high = nums.Length-1;
40
41        int mid;
42
43        while(low<=high)
44        {
45            mid = low + (high-low)/2;
46
47            if(nums[mid]<=target && target<=nums[high])
48            {
49                if(target==nums[mid])
50                {
51                    last = mid;
52                }
53                low = mid+1;
54            }
55            else
56            {
57                high = mid - 1;
58            }
59        }
60
61        return last;
62    }
63}