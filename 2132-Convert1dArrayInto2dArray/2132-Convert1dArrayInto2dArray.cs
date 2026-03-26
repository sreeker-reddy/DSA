// Last updated: 3/26/2026, 1:47:40 AM
public class Solution {
    public int[][] Construct2DArray(int[] original, int m, int n) {
        if(m * n != original.Length) return new int[0][]{};
        int[][] result = new int[m][];
        int counter = 0;
        for(int i = 0; i < m; i++){
            result[i] = new int[n];
            for(int j = 0; j < n; j++){
                result[i][j] = original[counter];
                counter++;
            }
        }
        return result;
    }
}