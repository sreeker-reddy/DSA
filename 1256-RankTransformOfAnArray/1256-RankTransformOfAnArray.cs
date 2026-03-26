// Last updated: 3/26/2026, 1:50:15 AM
public class Solution {
    public int[] ArrayRankTransform(int[] arr) {
        int[] temp = new int[arr.Length];
        Array.Copy(arr,temp,arr.Length);
        Array.Sort(temp);
        
        Dictionary<int,int> dict = new Dictionary<int,int>();
        int j=1;
        for(int i=0;i<temp.Length;i++)
        {
            if(!dict.ContainsKey(temp[i]))
            {
                dict.Add(temp[i],j);
                j++;
            }
        }
        
        int[] result = new int[temp.Length];
        
        for(int i=0;i<arr.Length;i++)
        {
            result[i] = dict[arr[i]];
        }
        
        return result;
    }
}