// Last updated: 3/26/2026, 1:55:01 AM
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<index.length;i++){
            list.add(index[i],nums[i]);
        }
        int[] result = list.stream().mapToInt(i->i).toArray();
        return result;
    }
}