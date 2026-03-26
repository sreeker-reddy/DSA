// Last updated: 3/26/2026, 1:50:00 AM
class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<sb.length();i++){
            if(i==0 || sb.charAt(i)!=sb.charAt(i-1)){
                stack.push(1);
            }
            else{
                int inc = stack.pop()+1;
                if(inc == k){
                    sb.delete(i-k+1,i+1);
                    i=i-k;
                }
                else{
                    stack.push(inc);
                }
            }
        }
        return sb.toString();
    }
}