// Last updated: 3/26/2026, 1:50:04 AM
class Solution {
    
    int timer = 0;
    
    
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
       Map<Integer,List<Integer>> adjList = new HashMap<>();
        
        for(int i=0;i<n;i++)
            adjList.put(i,new ArrayList<Integer>());
        
        for(List<Integer> connection : connections){
            adjList.get(connection.get(0)).add(connection.get(1));
            adjList.get(connection.get(1)).add(connection.get(0));
        }
        boolean[] visited = new boolean[n];
        
        Map<Integer,Integer> arrival = new HashMap<>();
        
        Map<Integer,Integer> low = new HashMap<>();
        
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(!visited[i])
                dfs(i,-1,visited,adjList,arrival,low,result);
        }
        return result;
    }
    
    private void dfs(int node, int parent, boolean[] visited, Map<Integer,List<Integer>> adjList, Map<Integer,Integer> arrival, Map<Integer,Integer> low, List<List<Integer>> result){
        visited[node] = true;
        
        int arrivalTime = timer++;
        arrival.put(node,arrivalTime);
        low.put(node,arrivalTime);
        
        for(int i:adjList.get(node)){
            if(!visited[i]){
                dfs(i,node,visited,adjList,arrival,low,result);
                low.put(node,Math.min(low.get(node),low.get(i)));
            }
            else if(i!=parent){
                low.put(node,Math.min(low.get(node),arrival.get(i)));
            }
            if(low.get(i) > arrival.get(node)){
                List<Integer> list = new ArrayList<>();
                list.add(node);
                list.add(i);
                result.add(list);
            }
        }
    }
}