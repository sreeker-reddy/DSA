// Last updated: 4/1/2026, 10:52:30 AM
1public class Solution {
2    public bool IsIsomorphic(string s, string t) {
3        HashSet<char> hs = new();
4        Dictionary<char,char> dict = new();
5
6        if(s.Length!=t.Length)
7            return false;
8
9        for(int i=0;i<s.Length;i++)
10        {
11            if(!dict.ContainsKey(s[i]))
12            {
13                if(hs.Contains(t[i]))
14                    return false;
15                dict.Add(s[i], t[i]);
16                hs.Add(t[i]);
17            }
18            else
19            {
20                if(dict[s[i]]!=t[i])
21                    return false;
22            }
23        }
24
25        return true;
26    }
27}