// Last updated: 3/26/2026, 1:49:24 AM
class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        
        for(int i=0;i<arr.length;i++){
            res[i] = countBits(arr[i]) * 10001 + arr[i];
        }
        Arrays.sort(res);
        for(int i=0;i<n ;i++){
            res[i] = res[i]%10001;
        }
        return res;
    }
    
    public int countBits(int n){
        int bitCount = 0;
        while(n>0){
            n = n&(n-1);
            bitCount++;
        }
        return bitCount;
    }
    
    
}




