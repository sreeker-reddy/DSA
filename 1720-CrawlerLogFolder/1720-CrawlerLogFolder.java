// Last updated: 3/26/2026, 1:47:58 AM
class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        
        for(String log : logs){
            if(log.equals("../")){
                if(!stack.isEmpty())
                    stack.pop();
            }
            else if(log.equals("./")){
                continue;
            }
            else{
                stack.push(log);
            }
        }
        return stack.size();
    }
}