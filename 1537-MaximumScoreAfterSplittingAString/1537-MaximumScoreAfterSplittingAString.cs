// Last updated: 3/26/2026, 1:48:30 AM
public class Solution {
    public int MaxScore(string s) {
        int countLeft0 = 0;
        int countRight1 = 0;
        int maxScore = 0;
        
        for(int i=0;i<s.Length;i++)
        {
            if(s[i] == '1')
                countRight1++;
        }
        
        for(int i=0;i<s.Length-1;i++)
        {
            if(s[i]=='1')
            {
                countRight1--;
            }
            else
                countLeft0++;
            
            maxScore = Math.Max(maxScore, countLeft0 + countRight1);
        }
        
        return maxScore;
    }
}