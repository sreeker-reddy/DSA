// Last updated: 3/26/2026, 1:50:05 AM
class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        
        Stack<String> stack = new Stack();
        
        for(char c : s.toCharArray()){
            if(c =='('){
                stack.push(sb.toString());
                sb = new StringBuilder();
            }
            else if(c==')'){
                sb.reverse();
                sb.insert(0,stack.pop());
            }
            else
                sb.append(c);
        }
        return sb.toString();
    }
}