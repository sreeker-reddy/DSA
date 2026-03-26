// Last updated: 3/26/2026, 1:47:38 AM
public class Solution {
    public int[] PlatesBetweenCandles(string s, int[][] queries) {
        int n = s.Length;
        int[] left = new int[n];
        int[] right = new int[n];

        int[] prefix = new int[n];

        List<int> result = new List<int>();

        int l = -1, r = -1;
        int prefixCount = 0;

        for(int i=0;i<n;i++)
        {
            if(s[i]=='*')
                prefixCount++;

            prefix[i] = prefixCount;

            if(s[i]=='|')
                l=i;

            left[i]=l;
        }

        for(int i=s.Length-1;i>=0;i--)
        {
            if(s[i]=='|')
                r=i;

            right[i]=r;
        }

        foreach(int[] q in queries)
        {
            int start = q[0];
            int end = q[1];

            int startl = right[start];
            int endr = left[end];
            
            if(startl<0 || endr<0 || startl>=endr)
            {
                result.Add(0);
                continue;
            }
            result.Add(prefix[endr] - prefix[startl]);
        }
        return result.ToArray();
    }
}

/*

         * * | * * | * * * |
         0 1 2 3 4 5 6 7 8 9
prefix = 1 2 1 3 4 4 5 6 7 7
left =   m m 2 2 2 5 5 5 5 9
right =  2 2 2 5 5 5 9 9 9 9

query = 2,5
right[2]=2 left[5]=5 4-2=2

query = 5,9
right[5]=5 left[9]=9 7-4=3

*/