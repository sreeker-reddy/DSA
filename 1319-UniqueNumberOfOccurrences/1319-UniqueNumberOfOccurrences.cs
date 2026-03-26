// Last updated: 3/26/2026, 1:50:01 AM
public class Solution {
    public bool UniqueOccurrences(int[] arr) {
        Dictionary<int,int> occ = new Dictionary<int, int>();
        
        for(int i=0; i< arr.Length; i++)
        {
            if (occ.ContainsKey(arr[i])) { occ[arr[i]]++; } 
            else { occ[arr[i]] = 1; }            
        }
        
        HashSet<int> unique = new HashSet<int>();
        foreach(int key in occ.Keys)
        {
            if (!unique.Add(occ[key])) { return false; }
        }
         
        return true;
    }
}