// Last updated: 3/26/2026, 1:47:55 AM
public class Solution {
    public IList<bool> CheckArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<bool> result = new List<bool>();
        
        for(int i=0;i<l.Length;i++)
        {
            int[] temp = new int[r[i]-l[i]+1];
            
            for(int j=0;j<temp.Length;j++)
                temp[j]=nums[l[i]+j];
            
            Array.Sort(temp);
            
            if(temp.Length==1)
            {
                result.Add(true);
                continue;
            }
            
            int tempSub = temp[1]-temp[0];
            int k = 2;
            for(;k<temp.Length;k++)
            {
                if((temp[k]-temp[k-1])==tempSub)
                    continue;
                else
                {
                    result.Add(false);
                    break;
                }
            }
            if(k==temp.Length)
                result.Add(true);
        }
        
        return result;
    }
}