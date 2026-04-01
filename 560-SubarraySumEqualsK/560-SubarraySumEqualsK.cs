// Last updated: 4/1/2026, 11:55:30 AM
1public class Solution {
2    public int SubarraySum(int[] nums, int k) {
3        Dictionary<int,int> dict = new();
4        dict.Add(0,1);
5        int count = 0;
6        int sum = 0;
7        foreach(int num in nums)
8        {
9            sum+=num;
10            if(dict.ContainsKey(sum-k))
11            {
12                count+=dict[sum-k];
13            }
14            
15            if(!dict.ContainsKey(sum))
16            {
17                dict.Add(sum,1);
18            }
19            else
20            {
21                dict[sum]++;
22            }
23        }
24
25        return count;
26    }
27}
28
29/*
30nums = [0,0,3,3,0,0,3]
31k = 3
32Output = 9
33
340,1 0,2 0,3 3,1 6,1 6,2 6,3 9,1
35count = 3+1+1+1+3 = 9
36
37nums = [0,0]
38k = 3
39Output = 0
40
410,1 0,2 0,3
42count = 0
43
44a+b+c=k
45a a+b a+b+c
46a-k=0 a+b-k=0 b-k=0 a+b+c-k=0 b+c-k=0 c-k=0
47*/