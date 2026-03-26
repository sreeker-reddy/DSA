// Last updated: 3/26/2026, 1:49:40 AM
class Solution {
    public int subtractProductAndSum(int n) {
       int sum = 0;
        int product = 1;
        while(n>0){
            product = product*(n%10);
            sum+=(n%10);
            n=n/10;
        }
        return product - sum;
    }
}