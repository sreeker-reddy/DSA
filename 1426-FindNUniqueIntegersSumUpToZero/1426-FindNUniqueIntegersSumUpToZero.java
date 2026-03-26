// Last updated: 3/26/2026, 1:49:31 AM
class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int sum = 0;
        for(int i=0;i<n-1;i++){
            result[i]=i; sum+=i;
        }
        result[n-1]=-sum;
        return result;
    }
}