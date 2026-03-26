// Last updated: 3/26/2026, 1:47:47 AM
public class Solution {
    public string MergeAlternately(string word1, string word2) {
        StringBuilder sb = new StringBuilder();
        
        int length1 = word1.Length;
        int length2 = word2.Length;
        
        int i=0;
        
        while(i<length1 && i<length2)
        {
            sb.Append(word1[i].ToString());
            sb.Append(word2[i].ToString());
            i++;
        }
        
        if(i<length1)
            sb.Append(word1.Substring(i, word1.Length-i));
        
        if(i<length2)
            sb.Append(word2.Substring(i, word2.Length-i));
    
        return sb.ToString();
    }
}