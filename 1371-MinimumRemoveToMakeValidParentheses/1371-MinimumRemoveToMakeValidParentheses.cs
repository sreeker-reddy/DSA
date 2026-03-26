// Last updated: 3/26/2026, 1:49:50 AM
public class Solution {
    public string MinRemoveToMakeValid(string s) {
        int open = 0;
        int balance = 0;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.Length;i++)
        {
            if(s[i]==')')
            {
                if(balance>0)
                {
                    balance--;
                }
                else
                {
                    continue;
                }
            }
            else
            if(s[i]=='(')
            {
                open++;
                balance++;
            }
            sb.Append(s[i]);
        }
        StringBuilder result = new StringBuilder();
        int keep = open - balance;
        foreach(char c in sb.ToString())
        {
            if(c=='(')
            {
                keep--;
                if(keep<0)
                    continue;
            }
            result.Append(c);
        }

        return result.ToString();
    }
}