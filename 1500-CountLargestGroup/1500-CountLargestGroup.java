// Last updated: 3/26/2026, 1:49:07 AM
class Solution {
    public int countLargestGroup(int n) {
        int[] sum = new int[n+1];
        int maxSize = 0;
        for(int i=1;i<=n;i++){
            int s = getDigitSum(i);
            sum[s]++;
            maxSize = Math.max(maxSize,sum[s]);
        }
        
        int count = 0;
        for(int i=0;i<=n;i++){
            if(sum[i]==maxSize)
                count++;
        }
        return count;
    }
    
    private int getDigitSum(int n){
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n = n/10;
        }
        return sum;
    }
}