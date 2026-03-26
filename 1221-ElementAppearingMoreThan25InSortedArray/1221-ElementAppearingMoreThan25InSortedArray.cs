// Last updated: 3/26/2026, 1:50:29 AM
public class Solution {
    public int FindSpecialInteger(int[] arr) {
        int minCount = (arr.Length/4);
        int count = 1;
        
        for(int i=1;i<arr.Length;i++)
        {
            if(arr[i]==arr[i-1])
                count++;
            else
                count=1;
            
            if(count>minCount)
                return arr[i];
        }
        
        return arr[0];
    }
}