// Last updated: 3/26/2026, 1:47:24 AM
public class Solution {
    public int SmallestNumber(int n) {
         int x = 1;
        while (x < n) {
            x = x * 2 + 1;
        }
        return x;
    }
}