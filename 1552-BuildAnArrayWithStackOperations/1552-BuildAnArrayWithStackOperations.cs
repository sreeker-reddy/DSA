// Last updated: 3/26/2026, 1:48:27 AM
public class Solution {
    public IList<string> BuildArray(int[] target, int n) {
        IList<string> result  = new List<string>();
        
        int targetIndex = 0;
        
        if(target == null || target.Length == 0)
	    {
		    return result;
	    }
        
        for(int i=1;i<=n;i++)
        {
            result.Add("Push");
            
            if(target[targetIndex]!=i)
            {
                result.Add("Pop");
            }
            else
            {
                targetIndex++;
            }
            
            if(targetIndex == target.Length)
                return result;
            else
                continue;
        }
        
        return result;
    }
}