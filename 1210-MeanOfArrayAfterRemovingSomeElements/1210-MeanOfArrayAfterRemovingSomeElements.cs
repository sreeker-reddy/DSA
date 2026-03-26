// Last updated: 3/26/2026, 1:50:34 AM
public class Solution {
    public double TrimMean(int[] arr) {
        int n = arr.Length;
	Array.Sort(arr);

	int sum = 0;
	for (int i = n / 20; i < 19 * n / 20; i++)
		sum += arr[i];

	return sum / (0.9 * n);
    }
}