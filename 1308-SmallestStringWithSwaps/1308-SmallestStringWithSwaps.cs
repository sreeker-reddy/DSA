// Last updated: 3/26/2026, 1:50:06 AM
public class Solution {
    public string SmallestStringWithSwaps(string s, IList<IList<int>> pairs) 
    {
        int n = s.Length;
        List<List<int>> adjList = new();
        
        for(int i=0;i<n;i++)
            adjList.Add(new());
        
        foreach(var p in pairs)
        {
            adjList[p[0]].Add(p[1]);
            adjList[p[1]].Add(p[0]);
        }
        
        HashSet<int> visited = new();
        char[] arr = s.ToCharArray();
        
        for(int i=0;i<n;i++)
        {
            if(!visited.Contains(i))
            {
                visited.Add(i);
                List<int> connectedIndices = new();
                connectedIndices.Add(i);
                Dfs(adjList,i,visited,connectedIndices);
                KeepTheCharInAscendingOrder(arr,connectedIndices);
            }
        }
        
        return new string(arr);
    }
    
    private void Dfs(List<List<int>> adjList, int node, HashSet<int> visited, List<int> indices)
    {
        foreach(var nd in adjList[node])
        {
            if(!visited.Contains(nd))
            {
                visited.Add(nd);
                indices.Add(nd);
                Dfs(adjList,nd,visited,indices);
            }
        }
    }
    
    private void KeepTheCharInAscendingOrder(char[] arr, List<int> connectedIndices)
    {
        List<char> charList = new();

        foreach(var ind in connectedIndices)
            charList.Add(arr[ind]);

        charList.Sort();
        connectedIndices.Sort();
        
        for(int i=0; i<connectedIndices.Count; i++)
        {
            arr[connectedIndices[i]] = charList[i];
        }
    }
}