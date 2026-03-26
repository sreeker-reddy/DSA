// Last updated: 3/26/2026, 1:48:35 AM
class Solution {
    public int minStartValue(int[] nums) {
        int startValue = 0;
        int minNegative = 0;
        for(int i=0;i<nums.length;i++){
            startValue +=nums[i];
              minNegative =  Math.min(minNegative,startValue);
            
        }
        
        return ((-1) * minNegative+1);
    }
}