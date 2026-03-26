// Last updated: 3/26/2026, 1:47:42 AM
public class Solution {
    public IList<IList<int>> FindRLEArray(int[][] encoded1, int[][] encoded2) {
        int pointer1 = 0;
        int pointer2 = 0;
        List<IList<int>> result = new();
        while(pointer1<encoded1.Length && pointer2<encoded2.Length)
        {
            int len = Math.Min(encoded1[pointer1][1], encoded2[pointer2][1]);
            int val = encoded1[pointer1][0]*encoded2[pointer2][0];

            if(result.Count>0 && result[result.Count-1][0]==val)
                result[result.Count-1][1]+=len;
            else
                result.Add(new List<int>(){val,len});

            encoded1[pointer1][1]-=len;
            encoded2[pointer2][1]-=len;

            if(encoded1[pointer1][1]==0) pointer1++;
            if(encoded2[pointer2][1]==0) pointer2++;
        }

        return result;
    }
}