// Last updated: 3/26/2026, 1:50:11 AM
class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] freq = new int[words.length];
        int[] result = new int[queries.length];
        for(int i=0;i<words.length;i++){
            freq[i] = getFrequency(words[i]);
        }
        
        for(int i=0;i<freq.length;i++){
            System.out.print("  " + freq[i]);
        }
        int t =0;
        for(int i=0;i<queries.length;i++){
            int q_freq = getFrequency(queries[i]);
            int count = 0;
            for(int f=0;f<freq.length;f++){
                if(freq[f] > q_freq)
                    count++;
            }
            result[i] = count;
        }
        return result;
    }
    
    private int getFrequency(String word){
        int[] f = new int[26];
        int result = 0;
        for(char c : word.toCharArray())
        {
            f[c-'a']++;
        }
        for(int k=0;k<26;k++){
            if(f[k]>0)
            {
                result = f[k];break;
            }
        }
        return result;
    }
}