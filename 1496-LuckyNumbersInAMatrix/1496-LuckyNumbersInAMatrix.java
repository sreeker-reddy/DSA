// Last updated: 3/26/2026, 1:49:11 AM
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new LinkedList<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                int min = matrix[i][j];
                boolean isMin = true;
                for(int k=0;k<matrix[i].length;k++){
                    if(matrix[i][k] < min){
                        isMin=false;break;
                    }
                }
                int max = matrix[i][j];
                boolean isMax = true;
                for(int k=0;k<matrix.length;k++){
                    if(matrix[k][j] > max){
                        isMax=false;break;
                    }
                }
                if(isMin && isMax){
                    result.add(matrix[i][j]);
                }
            }
        }
        return result;
    }
}