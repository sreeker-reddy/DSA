// Last updated: 3/31/2026, 2:05:37 PM
1/**
2 * // This is ArrayReader's API interface.
3 * // You should not implement it, or speculate about its implementation
4 * class ArrayReader {
5 *     public int Get(int index) {}
6 * }
7 */
8
9class Solution {
10    public int Search(ArrayReader reader, int target) {
11        int low = 0;
12        int high = 1;
13
14        while(reader.get(high)<target)
15        {
16            low = high;
17            high = 2*high;
18        }
19
20        return BinarySearch(reader,target,low,high);
21    }
22
23    private int BinarySearch(ArrayReader reader, int target, int low,int high)
24    {
25        while(low<=high)
26        {
27            int mid = low+(high-low)/2;
28            if(reader.get(mid)==target)
29            {
30                return mid;
31            }
32            else
33            {
34                if(reader.get(mid)<target)
35                {
36                    low = mid+1;
37                }
38                else
39                {
40                    high = mid-1;
41                }
42            }
43        }
44        return -1;
45    }
46}