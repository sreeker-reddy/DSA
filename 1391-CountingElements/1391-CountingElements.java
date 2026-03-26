// Last updated: 3/26/2026, 1:49:45 AM
class Solution {
    public int countElements(int[] arr) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i]+1))
                count++;
        }
        return count;
    }
}