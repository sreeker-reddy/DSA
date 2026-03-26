// Last updated: 3/26/2026, 1:47:27 AM
public class Solution {
    public bool CanMakeSubsequence(string str1, string str2) {
        int str2Index = 0;
        
        for(int str1Index = 0; str1Index<str1.Length && str2Index<str2.Length;str1Index++)
        {
            if(str1[str1Index]==str2[str2Index] || 
               (str1[str1Index]+1==str2[str2Index]) ||
               (str1[str1Index]-25==str2[str2Index])
              )
            {
                str2Index++;
            }
        }
        return str2Index==str2.Length;
    }
}