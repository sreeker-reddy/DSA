// Last updated: 3/26/2026, 1:49:59 AM
class Solution {
    public int minCostToMoveChips(int[] chips) {
        int even =0, odd = 0;
        int n = chips.length;
        for(int i=0;i<n;i++){
            if(chips[i]%2 == 0)
                even++;
            else odd++;
        }
        return Math.min(even,odd);
    }
}