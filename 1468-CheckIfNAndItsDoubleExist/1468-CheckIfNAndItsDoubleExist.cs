// Last updated: 3/26/2026, 1:49:21 AM
public class Solution {
    public bool CheckIfExist(int[] arr) {
        HashSet<int> hs = new HashSet<int>();
        
        foreach(int num in arr)
        {
            if(hs.Contains(2*num) || (num%2==0 && hs.Contains(num/2)))
                return true;
            else
                hs.Add(num);
        }
        
        return false;
    }
}