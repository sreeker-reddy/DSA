// Last updated: 3/26/2026, 1:49:30 AM
class Solution {
     boolean[] visited;
        
    public boolean canReach(int[] arr, int start) {
       visited = new boolean[arr.length];
      return helper(arr,start,visited);
    }
    
    
    private boolean helper(int[] arr, int start, boolean[] visited){
        if(start<0 || start >= arr.length)
            return false;
        if(visited[start]==true)
            return false;
        if(arr[start] == 0)
            return true;
        visited[start] = true;
        return helper(arr,start+arr[start], visited) || helper(arr,start-arr[start],visited);
    }
}