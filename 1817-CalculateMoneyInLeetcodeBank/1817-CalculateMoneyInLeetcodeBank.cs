// Last updated: 3/26/2026, 1:47:50 AM
public class Solution {
    
    public int TotalMoney(int n) {
        int monday = 1;
        int ans = 0;

        while (n > 0) {
            for (int day = 0; day < Math.Min(n, 7); day++) {
                ans += monday + day;
            }
            
            n -= 7;
            monday++;
        }
        
        return ans;
    }
}