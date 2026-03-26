// Last updated: 3/26/2026, 1:50:17 AM
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer,PriorityQueue<Integer>> map = new HashMap<>();
        
        int m = mat.length, n = mat[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                map.putIfAbsent(i-j, new PriorityQueue<>());
                map.get(i-j).add(mat[i][j]);
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = map.get(i-j).poll();
            }
        }
        return mat;
    }
}