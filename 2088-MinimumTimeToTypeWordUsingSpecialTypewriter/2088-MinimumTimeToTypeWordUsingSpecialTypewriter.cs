// Last updated: 3/26/2026, 1:47:41 AM
public class Solution {
    public int MinTimeToType(string word) {
        int op = 0;
        char start = 'a';
        foreach(char c in word)
        {
            int temp = Math.Abs((int)start-c);
            if(temp<=13)
                op+=temp;
            else
            {
                op+=26-temp;
            }
            start = c;
        }

        return op + word.Length;
    }
}