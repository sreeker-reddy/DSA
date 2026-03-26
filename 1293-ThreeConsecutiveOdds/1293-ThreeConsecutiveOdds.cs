// Last updated: 3/26/2026, 1:50:08 AM
public class Solution {
    public bool ThreeConsecutiveOdds(int[] arr) {
        int count = 0;

        foreach(int num in arr)
        {
            if(num%2==1)
                count++;
            else
                count = 0;

            if(count==3)
                return true;
        }
        return false;
    }
}