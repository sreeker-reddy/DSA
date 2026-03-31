// Last updated: 3/31/2026, 2:17:50 PM
1public class Solution {
2    public bool SearchMatrix(int[][] matrix, int target) {
3        int m = matrix.Length;
4        int n = matrix[0].Length;
5
6        int low = 0;
7        int high = m*n-1;
8
9        int mid;
10
11        while(low<=high)
12        {
13            mid = low + (high-low)/2;
14            int row = mid/n;
15            int col = mid%n;
16
17            if(matrix[row][col]==target)
18                return true;
19
20            if(matrix[row][col]<target)
21            {
22                low = mid+1;
23            }
24            else
25            {
26                high = mid-1;
27            }
28        }
29
30        return false;
31    }
32}