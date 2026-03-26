// Last updated: 3/26/2026, 1:48:12 AM
public class Solution {
    public int FindLeastNumOfUniqueInts(int[] arr, int k) {
        Dictionary<int,int> frequencies = new();
        foreach(int n in arr) {
            if (!frequencies.ContainsKey(n))
                frequencies.Add(n,1);
            else frequencies[n]++;
        }

        PriorityQueue<int,int> pq = new();
        foreach(var kvp in frequencies)
            pq.Enqueue(kvp.Value, kvp.Value);

        while (k>0)
            k -= pq.Dequeue();
        return (k==0) ? pq.Count : pq.Count+1;
    }
}