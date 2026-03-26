// Last updated: 3/26/2026, 1:47:57 AM
class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int maxCount = 0;
        for(char c : s.toCharArray()){
            if(c=='('){
                count++;
                maxCount = Math.max(count,maxCount);
            }
            else if(c==')'){
                count--;
            }
        }
        return maxCount;
    }
}