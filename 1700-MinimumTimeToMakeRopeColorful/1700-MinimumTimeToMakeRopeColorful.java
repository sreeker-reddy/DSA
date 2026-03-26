// Last updated: 3/26/2026, 1:48:04 AM
class Solution {
    public int minCost(String s, int[] cost) {
        int result = 0;
        char[] str = s.toCharArray();
        
        int max = 0;
        for(int i=1;i<str.length;i++){
            if(str[max] == str[i]){
                result+=Math.min(cost[max],cost[i]);
                if(cost[i] >= cost[max]){
                    max = i;
                }
            }
            else
                max = i;
        }
        return result;
    }
}