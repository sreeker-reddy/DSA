// Last updated: 3/26/2026, 1:49:08 AM
class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k)
            return false;
        
        int[] count = new int[26];
        
        for(char c : s.toCharArray()){
            count[c-'a']++;
        }
        
        int oddCount = 0;
        
        for(int i=0;i<26;i++){
            if(count[i]%2==1){
                oddCount++;
            }
        }
        return oddCount<=k;
    }
}