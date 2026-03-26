// Last updated: 3/26/2026, 1:48:28 AM
class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<int[]> sumValues = new ArrayList<>();
        
        for(int i=0;i<nums.size();i++){
            List<Integer> current = nums.get(i);
            
            for(int j=0;j<current.size();j++){
                int[] x = new int[3];
                x[0] = i+j;
                x[1] = j;
                x[2] = current.get(j);
                sumValues.add(x);
            }
        }
        
        Collections.sort(sumValues, (a,b) -> {
            if(a[0] == b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
        int[] result = new int[sumValues.size()];
        int k=0;
        for(int[] value : sumValues){
            result[k++] = value[2];
        }
        
        return result;
    }
}