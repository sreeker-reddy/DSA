// Last updated: 3/26/2026, 1:49:19 AM
public class Solution {
    public int FindTheLongestSubstring(string s) {
        // Bitmask to track the parity of vowels
        int mask = 0;
        int maxLength = 0;
        var maskToIndex = new Dictionary<int, int>();
        maskToIndex[0] = -1;  // Base case: even parity for all vowels at the beginning

        for (int i = 0; i < s.Length; i++) {
            // Update the mask for vowels
            if (s[i] == 'a') mask ^= 1 << 0;
            else if (s[i] == 'e') mask ^= 1 << 1;
            else if (s[i] == 'i') mask ^= 1 << 2;
            else if (s[i] == 'o') mask ^= 1 << 3;
            else if (s[i] == 'u') mask ^= 1 << 4;

            // Check if we've seen this mask before
            if (maskToIndex.ContainsKey(mask)) {
                // Calculate the length of the substring between the two indices
                maxLength = Math.Max(maxLength, i - maskToIndex[mask]);
            } else {
                // Store the first occurrence of this mask
                maskToIndex[mask] = i;
            }
        }

        return maxLength;
    }
}