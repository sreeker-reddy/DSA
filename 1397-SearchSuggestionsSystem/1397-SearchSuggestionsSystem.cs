// Last updated: 3/26/2026, 1:49:43 AM
public class Solution {
    public IList<IList<string>> SuggestedProducts(string[] products, string searchWord) {
        int left = 0;
        int right = products.Length-1;
        Array.Sort(products);

        List<IList<string>> result = new List<IList<string>>();
        for(int i=0;i<searchWord.Length;i++)
        {
            while(left<=right && (products[left].Length<=i || products[left][i]!=searchWord[i])) left++;
            while(left<=right && (products[right].Length<=i || products[right][i]!=searchWord[i])) right--;

            result.Add(products.Skip(left).Take(Math.Min(3,right-left+1)).ToList());
        }
        return result;
    }
}