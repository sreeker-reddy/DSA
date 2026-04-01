// Last updated: 4/1/2026, 12:32:56 PM
1public class Solution {
2    public int LongestPalindrome(string s) {
3        int maxLength = 0;
4
5        Dictionary<char,int> dict = new();
6        bool oddExists  = false;
7        foreach(char c in s)
8        {
9            if(!dict.ContainsKey(c))
10                dict.Add(c,1);
11            else
12                dict[c]++;
13        }
14
15        foreach(var d in dict)
16        {
17            if(d.Value%2==0)
18            {
19                maxLength+=d.Value;
20            }
21            else
22            {
23                maxLength+=d.Value-1;
24                oddExists = true;
25            }
26        }
27
28        if(oddExists)
29            return maxLength+1;
30        else
31            return maxLength;
32    }
33}