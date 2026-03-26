// Last updated: 3/26/2026, 1:47:28 AM
public class Solution {
    public int LongestValidSubstring(string word, IList<string> forbidden) {
        HashSet<string> forbid = new HashSet<string>(forbidden.ToArray());

        int left = 0;
        int right = 0;

        int maxLength = 0;
        
        while(right<word.Length)
        {
            if(checkForbidden(word.Substring(left,right-left+1), forbid, out int leftResult))
            {
                left += leftResult;
                right++;
            }
            else
            {
                right++;
                maxLength = Math.Max(maxLength, right-left);
            }

        }

        return maxLength;
    }
    
    private bool checkForbidden(string word, HashSet<string> forbidden, out int left)
    {
        int counter = 10;
        left = word.Length;
        for(int i=word.Length-1;i>=0 && counter>0;i--, counter--)
        {
            if(forbidden.Contains(word.Substring(i,word.Length-i)))
                return true;

            left=i;
        }
        return false;
    }
}