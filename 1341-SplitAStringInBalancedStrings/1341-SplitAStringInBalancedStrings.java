// Last updated: 3/26/2026, 1:49:56 AM
class Solution {
    public int balancedStringSplit(String s) {
     int rCount =0, lCount=0; 
        int totalCount = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L')
                lCount++;
            if(s.charAt(i)=='R')
                rCount++;
            if(lCount==rCount)
            {
                totalCount++;  
                lCount=0;
                rCount=0;
            }
        }
        return totalCount;
    }
}