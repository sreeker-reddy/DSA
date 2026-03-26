// Last updated: 3/26/2026, 1:48:26 AM
class Solution {
    int totalTime;
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        totalTime = 0;
        if(edges == null || edges.length ==0){
            return totalTime;
        }
        
        List<List<Integer>> adjList = new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++)
            adjList.add(new ArrayList<Integer>());
        for(int[] edge : edges){
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        
        
        boolean[] visited = new boolean[n];
        return  dfs(adjList,0,visited,hasApple);
       
    }
    
    private int dfs(List<List<Integer>> adjList, int currentNode, boolean[] visited,List<Boolean> hasApples){
        visited[currentNode] = true;
        int currentCount = 0;
        for(int a : adjList.get(currentNode)){
            if(!visited[a]){
                currentCount+=dfs(adjList,a,visited,hasApples);
            }
        }
        return (currentCount!=0 || hasApples.get(currentNode)) ? (currentNode == 0 ? currentCount : currentCount+2) : 0;
    }
}