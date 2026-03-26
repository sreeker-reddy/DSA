// Last updated: 3/26/2026, 1:49:10 AM
class Solution {
    int result = 0;
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<manager.length;i++){
            if(map.containsKey(manager[i])){
                map.get(manager[i]).add(i);
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(manager[i],list);
            }
        }
        dfs(headID, map,informTime,0);
        return result;
    }
    
    private void dfs(int headID, Map<Integer,List<Integer>> map, int[] informTime, int pathTime){
        List<Integer> employees = map.get(headID);
        if(employees == null){
            result = Math.max(result,pathTime);
            return;
        }
        else{
            pathTime+= informTime[headID];
            for(int a : employees){
                dfs(a,map,informTime,pathTime);
            }
        }
        
    }
}

