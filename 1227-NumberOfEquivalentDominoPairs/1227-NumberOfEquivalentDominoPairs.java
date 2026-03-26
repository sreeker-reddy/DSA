// Last updated: 3/26/2026, 1:50:26 AM
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int[] dom : dominoes){
            int small = Math.min(dom[0],dom[1]);
            int large = Math.max(dom[0],dom[1]);
            String key = small + "$" + large;
            count+=map.getOrDefault(key,0);
            map.put(key, map.getOrDefault(key,0)+1);
        }
        return count;
    }
}
