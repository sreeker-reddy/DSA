// Last updated: 3/26/2026, 1:55:00 AM
class Solution {
    public int findLucky(int[] arr) {
        int result = -1;
        int[] work = new int[501];
        for(int i=0;i<arr.length;i++){
            work[arr[i]]++;
        }
        
        for(int i=0;i<arr.length;i++){
            if(work[arr[i]] == arr[i])
                result = Math.max(arr[i],result);
        }
        return result;
    }
}