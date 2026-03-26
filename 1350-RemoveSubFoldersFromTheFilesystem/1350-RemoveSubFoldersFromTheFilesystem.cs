// Last updated: 3/26/2026, 1:49:54 AM
public class Solution {
    public IList<string> RemoveSubfolders(string[] folder) {
        Array.Sort(folder);

        List<string> result = new();
        result.Add(folder[0]);
        for(int i=1;i<folder.Length;i++)
        {
            string lastFolder = result[result.Count-1]+"/";
            if(folder[i].StartsWith(lastFolder))
            {
                continue;
            }
            else
            {
                result.Add(folder[i]);
            }
        }
        return result;
    }
}