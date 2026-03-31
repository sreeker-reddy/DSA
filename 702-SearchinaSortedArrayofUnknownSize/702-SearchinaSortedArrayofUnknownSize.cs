// Last updated: 3/31/2026, 2:06:51 PM
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
20        int mid;
21        while(low<=high)
22        {
23            mid = low + (high-low)/2;
24            if(reader.get(mid)==target)
25            {
26                return mid;
27            }
28
29            if(reader.get(mid)>target)
30            {
31                high = mid-1;
32            }
33            else
34            {
35                low = mid+1;
36            }
37        }
38
39        return -1;
40    }
41}