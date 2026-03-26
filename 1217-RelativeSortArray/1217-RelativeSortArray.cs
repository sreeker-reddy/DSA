// Last updated: 3/26/2026, 1:50:30 AM
public class Solution {
    public int[] RelativeSortArray(int[] arr1, int[] arr2) {
    var result = new List<int>(arr2);
    var temp = new List<int>();
	
    for (int i = 0; i < arr1.Length; i++)
    {
        var index = result.IndexOf(arr1[i]);
        if (index != -1)
             result.Insert(index, arr1[i]);
        else
             temp.Add(arr1[i]);
     }

    for (int i = 0; i < arr2.Length; i++)
    {
        result.Remove(arr2[i]);
    }

    temp.Sort();
    result.AddRange(temp);
    return result.ToArray();
    }
}