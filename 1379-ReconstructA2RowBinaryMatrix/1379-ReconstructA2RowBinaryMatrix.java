// Last updated: 3/26/2026, 1:49:48 AM
class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<Integer> upperList = new ArrayList<>();
        List<Integer> lowerList = new ArrayList<>();
        
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0;i<colsum.length;i++){
            if(colsum[i]==2){
                upperList.add(1);
                lowerList.add(1);
                upper--;
                lower--;
            }
            else if(colsum[i]==1){
                if(upper >= lower){
                    upperList.add(1);
                    lowerList.add(0);
                    upper--;
                }
                    
                else{
                    lowerList.add(1);
                    upperList.add(0);
                    lower--;
                }
                    
            }
            else if(colsum[i]==0){
                lowerList.add(0);
                upperList.add(0);
            }
        }
        if(upper!=0 || lower !=0)
            return new ArrayList();
        
        result.add(upperList);
        result.add(lowerList);
        return result;
    }
}