// Last updated: 3/26/2026, 1:47:31 AM
public class Solution {

    public class Priority
    {
        public int value;
        public int index;
    }
    public long FindScore(int[] nums) {
        long score = 0;
        bool[] marked = new bool[nums.Length];

        PriorityQueue<Priority,Priority> pq = new PriorityQueue<Priority,Priority>(
           Comparer<Priority>.Create((a,b)=>{return a.value==b.value ?  a.index-b.index : a.value-b.value;}));
        int i = 0;
        foreach(int n in nums)
        {
            pq.Enqueue(new Priority(){value = n,index = i},new Priority(){value = n,index = i});
            i++;
        }

        while(pq.Count>0)
        {
            var temp = pq.Dequeue();
            int number = temp.value;
            int index = temp.index;

            if(!marked[index])
            {
                score+=number;
                if(index-1>=0)
                    marked[index-1] = true;
                if(index+1<nums.Length)
                    marked[index+1] = true;
            }
        }
        return score;
    }
}