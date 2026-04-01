// Last updated: 4/1/2026, 10:37:39 AM
1public class Solution {
2    public IList<IList<string>> GroupAnagrams(string[] strs) {
3        if(strs.Length==0)
4            return new List<IList<string>>();
5
6        Dictionary<BigInteger, List<string>> dict= new();
7
8        foreach(string str in strs)
9        {
10            BigInteger hashCode = GetHashCode(str);
11            if(!dict.ContainsKey(hashCode))
12            {
13                dict.Add(hashCode, new List<string>());
14            }
15            dict[hashCode].Add(str);
16        }
17        return new List<IList<string>>(dict.Values);
18    }
19
20
21    private BigInteger GetHashCode(String s){
22
23        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
24
25        BigInteger mult = 1;
26
27        for(int i = 0; i < s.Length; i++){
28
29            char c = s[i];
30
31            mult = mult*(primes[c - 'a']);
32
33        }
34
35        return mult;
36
37    }
38}