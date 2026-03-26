// Last updated: 3/26/2026, 1:47:56 AM
class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        if(a.length() == 1)
            return true;
        int start = 0;
        int end = a.length()-1;
        while(start<=end && a.charAt(start) == b.charAt(end)){
            start++;end--;
        }
        if(start >1)
            return true;
        
        start =0;
        end = a.length()-1;
        while(start <=end && a.charAt(end) == b.charAt(start)){
            start++;
            end--;
        }
        if(start>1)
            return true;
        
        return false;
    }
}