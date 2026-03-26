// Last updated: 3/26/2026, 1:49:17 AM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       int[] result = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i] && i!=j){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}