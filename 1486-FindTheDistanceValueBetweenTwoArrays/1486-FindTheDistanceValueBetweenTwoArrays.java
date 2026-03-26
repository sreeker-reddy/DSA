// Last updated: 3/26/2026, 1:49:11 AM
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int i=0;i<arr1.length;i++){
            boolean there = false;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    there = true;break;
                }
            }
            if(!there){
                count++;
            }
        }
        return count;
    }
}