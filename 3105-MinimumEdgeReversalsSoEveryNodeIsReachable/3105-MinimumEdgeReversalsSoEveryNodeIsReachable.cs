// Last updated: 3/26/2026, 1:47:26 AM
public class Solution {
    int[] ans;
    Dictionary<int,List<int>> dict;
    HashSet<(int p, int c)> hs;
    public int[] MinEdgeReversals(int n, int[][] edges) {
        dict = new();
        ans = new int[n];
        hs = new();

        foreach(var edge in edges)
        {
            hs.Add((edge[0],edge[1]));
            if(!dict.ContainsKey(edge[0])) dict.Add(edge[0],new());
            if(!dict.ContainsKey(edge[1])) dict.Add(edge[1],new());

            dict[edge[0]].Add(edge[1]);
            dict[edge[1]].Add(edge[0]);

        }

        ans[0] = dfs(0,-1);
        foreach(var next in dict[0])
            Reroot(next,0);

        return ans;
    }

    private int dfs(int curr,int p)
    {
        int answer = 0;
        foreach(var next in dict[curr])
        {
            if(next==p) continue;
            answer+=dfs(next,curr)+(hs.Contains((curr,next))?0:1);
        }
        return answer;
    }

    private void Reroot(int curr, int p)
    {
        ans[curr] = ans[p]+ (hs.Contains((curr,p))?-1:1);
        foreach(var next in dict[curr])
        {
            if(next==p) continue;
            Reroot(next,curr);
        }
    }
}