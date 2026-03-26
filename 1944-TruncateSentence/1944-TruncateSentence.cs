// Last updated: 3/26/2026, 1:47:43 AM
public class Solution {
    public string TruncateSentence(string s, int k) {
        string[] splitString = s.Split(' ');
        
        StringBuilder result = new StringBuilder();
        
        for(int i=0;i<k;i++)
        {
            result.Append(splitString[i]);
            
            if(i!=k-1)
                result.Append(" ");
                
        }
        
        return result.ToString();
    }
}