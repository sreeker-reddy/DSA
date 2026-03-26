// Last updated: 3/26/2026, 1:48:19 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int k=0;
        for(int i=0;i+n<nums.length;i++)
        {
            result[k++]= nums[i];
            result[k++] = nums[i+n];
        }
        
       
        return result;
    }
}