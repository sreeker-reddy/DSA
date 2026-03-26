// Last updated: 3/26/2026, 1:47:32 AM
public class Solution {
    public int BestClosingTime(string c) {
        int max = 0;
        int score = 0;
        int best = -1;
        for (int i = 0; i < c.Length; ++i) 
        {
            score += (c[i] == 'Y') ? 1 : -1;
            if (score > max)
            {
                max = score;
                best = i;
            }
        }
        return best + 1;
    }
}