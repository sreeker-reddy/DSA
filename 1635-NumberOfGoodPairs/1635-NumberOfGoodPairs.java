// Last updated: 3/26/2026, 1:48:06 AM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]==nums[j])
                    result++;
            }
        }
        return result;
    }
}