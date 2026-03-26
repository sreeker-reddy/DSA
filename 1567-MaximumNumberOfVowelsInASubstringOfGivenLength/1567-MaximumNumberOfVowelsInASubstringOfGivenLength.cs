// Last updated: 3/26/2026, 1:48:23 AM
public class Solution {
    public int MaxVowels(string s, int k) {
        if(s==null || s.Length==0 || k==0)
            return 0;

        int left = 0;
        int right = 0;
        int count=0;
        int maxCount=0;
        while(right<s.Length)
        {
            if(right-left+1<=k)
            {
                if(s[right]=='a' || s[right]=='e' || s[right]=='i' || s[right]=='o' || s[right]=='u')
                    count++;
                right++;
            }
            else
            {
                if(s[left]=='a' || s[left]=='e' || s[left]=='i' || s[left]=='o' || s[left]=='u')
                    count--;
                left++;
            }

            maxCount=Math.Max(maxCount,count);
        }
        return maxCount;
    }
}