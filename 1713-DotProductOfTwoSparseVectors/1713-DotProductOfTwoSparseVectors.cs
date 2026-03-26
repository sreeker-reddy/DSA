// Last updated: 3/26/2026, 1:48:00 AM
public class SparseVector {

    private Dictionary<int, int> dict;

    public SparseVector(int[] nums) {
        dict = new Dictionary<int,int>();
        for (var i = 0; i < nums.Length; i++)
        {
            if (nums[i] != 0)
                dict[i] = nums[i];

        }
    }
    
    // Return the dotProduct of two sparse vectors
    public int DotProduct(SparseVector vec) {
        var sum = 0;
        foreach(var i in dict.Keys)
        {
            var v = 0;
            if (vec.dict.TryGetValue(i, out v))
                sum += dict[i] * v; // vec.dict[i];
        }

        //foreach (var l in vec._nums)
        //    Console.WriteLine(l);            
        return sum;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.DotProduct(v2);