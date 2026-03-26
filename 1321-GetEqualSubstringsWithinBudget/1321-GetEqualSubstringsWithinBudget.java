// Last updated: 3/26/2026, 1:49:59 AM
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int maxLen = 0;
        int start = 0, end = 0;
        char [] firstSubArray=s.toCharArray();
        char [] secondSubArray=t.toCharArray();
        int cost = 0;
        while(end < firstSubArray.length){
            cost+=Math.abs(firstSubArray[end] - secondSubArray[end]);
            while(cost>maxCost){
                int currentCost = Math.abs(firstSubArray[start] - secondSubArray[start]);
                cost-=currentCost;
                start++;
            }
           
            maxLen = Math.max(maxLen, end-start+1);
            end++;
        }
        return maxLen;
    }
}