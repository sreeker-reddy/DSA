// Last updated: 3/26/2026, 1:47:39 AM
public class Solution {
    public int MaxTwoEvents(int[][] events) {
        int[][] times = new int[events.Length*2][];
        int index = 0;
        foreach(int[] e in events)
        {
            times[index++] = new int[]{e[0],1,e[2]};
            times[index] = new int[]{e[1]+1,0,e[2]};

            index++;
        }

        Array.Sort(times, (a,b)=> {return a[0]==b[0]? a[1]-b[1]:a[0]-b[0];} );
        
        int ans = 0, maxValue = 0;

        foreach(var t in times)
        {
            if(t[1]==0)
            {
                maxValue = Math.Max(maxValue, t[2]);
                Console.WriteLine(t[0]+" "+t[1]+" "+t[2]);
            }
            else
            {
                ans = Math.Max(ans, t[2]+maxValue);
                Console.WriteLine(t[0]+" "+t[1]+" "+t[2]);
            }
        }
        return ans;
    }
}



/*
starts (1)  1 1 4
end (0)     4 6 6
Together.   1 1 4 4 6 6
flag.       1 1 0 1 0 0
Value       2 5 2 2 2 5

start (1) 1 4 2
end(0).   3 5 4
Together. 1 2 3 4 4 5
flag      1 1 0 0 1 0
Value     2 3 2 3 2 2

end+1 to ensure the end value is processed after start as start==end is a possibility

*/