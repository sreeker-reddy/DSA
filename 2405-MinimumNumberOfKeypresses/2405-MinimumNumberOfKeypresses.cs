// Last updated: 3/26/2026, 1:47:33 AM
public class Solution {
    public int MinimumKeypresses(string s) {
        Dictionary<char,int> dict = new();

        foreach(char c in s)
        {
            if(!dict.ContainsKey(c))
                dict.Add(c,1);
            else
                dict[c]++;
        }

        var temp = dict.OrderByDescending(x=> x.Value);
        
        int result = 0;
        int count = 1;
        int index = 0;
        foreach(var d in temp)
        {
            Console.WriteLine(d.Key + " " + d.Value);
            result+=d.Value*(index/9 + 1);

            index++;
        }

        return result;
    }
}