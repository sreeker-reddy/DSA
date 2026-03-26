// Last updated: 3/26/2026, 1:47:35 AM
public class Solution {
    public int MinimumOperations(int[] nums) {
        int[] set = new int[101];
        int l = nums.Length;
        int answer = 0;
        for (int i=0;i<l;i++){
            if (nums[i]!=0){
                set[nums[i]]++;
                if(set[nums[i]]==1)answer++;
            }
        }
        return answer;
    }
}