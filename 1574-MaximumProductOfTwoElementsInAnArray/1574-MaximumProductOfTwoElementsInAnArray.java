// Last updated: 3/26/2026, 1:48:20 AM
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums); 
        return (nums[nums.length-2] -1)*(nums[nums.length-1] -1);
    }
}