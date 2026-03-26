// Last updated: 3/26/2026, 1:48:18 AM
class Solution {
     int count = 0;
    public int minReorder(int n, int[][] connections) {
      //  int count = 0;
       List<List<Integer>> graph = new ArrayList<>();
        List<Set<Integer>> connSet = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
            connSet.add(new HashSet<>());
        }
        
        boolean[] visited = new boolean[n];
        for(int[] connection : connections)
        {
            graph.get(connection[0]).add(connection[1]);
            graph.get(connection[1]).add(connection[0]);
            connSet.get(connection[0]).add(connection[1]);
        }
        visited[0]= true;
        
        dfs(graph,connSet,visited,0);
        return count;
    }
    
    
    public void dfs(List<List<Integer>> graph,List<Set<Integer>> connSet,boolean[] visited, int n){
       for(int a:graph.get(n)){
           if(!visited[a]){
               visited[a] = true;
               if(connSet.get(n).contains(a))
                   count++;
               dfs(graph,connSet,visited,a);
           }
       }
    }
}