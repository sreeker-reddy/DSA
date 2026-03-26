// Last updated: 3/26/2026, 1:50:26 AM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<nums.length;i+=2){
            int freq = nums[i];
            int value = nums[i+1];
            for(int j=0;j<freq;j++)
                list.add(value);
        }
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            result[i] = list.get(i);
        }
        return result;
    }
}