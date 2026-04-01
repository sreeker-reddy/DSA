// Last updated: 4/1/2026, 12:36:44 PM
1public class Solution {
2    public int LongestPalindrome(string s) {
3        int maxLength = 0;
4        HashSet<char> hs = new();
5
6        foreach(char c in s)
7        {
8            if(hs.Contains(c))
9            {
10                maxLength+=2;
11                hs.Remove(c);
12            }
13            else
14            {
15                hs.Add(c);
16            }
17        }
18
19        return maxLength + (hs.Count==0?0:1);
20    }
21}