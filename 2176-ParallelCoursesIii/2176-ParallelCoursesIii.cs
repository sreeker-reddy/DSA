// Last updated: 3/26/2026, 1:47:37 AM
public class Solution {
    public int MinimumTime(int n, int[][] relations, int[] time) {
        Dictionary<int, List<int>> graph = new();
        int[] indegree = new int[n];

        for(int i=0;i<n;i++)
        if(!graph.ContainsKey(i))
                graph[i] = new List<int>();

        for(int i=0;i<relations.Length;i++)
        {
            int a = relations[i][0]-1;
            int b = relations[i][1]-1;

            graph[a].Add(b);
            indegree[b]++;
        }
        Queue<int> queue = new Queue<int>();
        int[] maxTime = new int[n];

        for(int i=0;i<n;i++)
        {
            if(indegree[i]==0)
            {
                queue.Enqueue(i);
                maxTime[i] = time[i];
            }
        }

        while(queue.Count>0)
        {
            var temp = queue.Dequeue();
            foreach(var k in graph[temp])
            {
                maxTime[k] = Math.Max(maxTime[k], maxTime[temp]+time[k]);
            
                indegree[k]--;
                if(indegree[k]==0)
                    queue.Enqueue(k);
            }
        }

        int ans = 0;
        for(int i=0; i<n;i++)
        {
            ans = Math.Max(ans,maxTime[i]);
        }

        return ans;
    }
}