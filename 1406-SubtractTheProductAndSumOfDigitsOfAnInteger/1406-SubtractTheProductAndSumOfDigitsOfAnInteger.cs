// Last updated: 3/26/2026, 1:49:38 AM
public class Solution {
    public int SubtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        
        if(n==0)
            return 0;
        
        while(n!=0)
        {
            int digit = n%10;
            sum+=digit;
            product*=digit;
            
            n=n/10;
        }
        
        return product-sum;
    }
}