// Last updated: 3/26/2026, 1:49:35 AM
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            int countDigit = 0;
            while(val>0){
                val=val/10;
                countDigit++;
            }
            if(countDigit%2==0)
                count++;
        }
        return count;
    }
}