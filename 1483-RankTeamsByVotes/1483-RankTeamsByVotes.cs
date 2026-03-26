// Last updated: 3/26/2026, 1:49:13 AM
public class Solution {
    public string RankTeams(string[] votes) {
        int n = votes[0].Length;
        int[][] teamStats = new int[26][];
        int[] teams = new int[26];

        for(int i=0;i<26;i++)
        {
            teamStats[i] = new int[n];
            teams[i] = i;
        }

        foreach(string vote in votes)
        {
            for(int i=0;i<n;i++)
            {
                teamStats[(int)(vote[i]-'A')][i]++;
            }
        }
        Array.Sort(teams, (a,b)=> {
            for(int i = 0;i<n;i++)
            {
                if(teamStats[a][i]!=teamStats[b][i])
                    return teamStats[b][i]-teamStats[a][i];
            }
            return a-b;
        });

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++)
        {
            sb.Append((char)(teams[i]+(int)'A'));
        }
        return sb.ToString();
    }
}