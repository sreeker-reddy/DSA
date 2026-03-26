// Last updated: 3/26/2026, 1:49:27 AM
class Solution {
    public String freqAlphabets(String s) {
        Stack<Integer> stack = new Stack();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) =='#'){
                int a = stack.pop();
                int b = stack.pop();
                a = b*10+a;
                stack.push(a);
            }
            else{
                stack.push(Character.getNumericValue(s.charAt(i)));
            }
        }
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()){
            int x = stack.pop();
            
            sb.append((char)(x+96));
        }
        String output = sb.reverse().toString();
        return output;
    }
}