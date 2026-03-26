// Last updated: 3/26/2026, 1:49:52 AM
class Solution {
    public String minRemoveToMakeValid(String s) {
        LinkedList<Integer> openIndex = new LinkedList<>();
        LinkedList<Integer> closeIndex = new LinkedList<>();
        int openCount = 0, closeCount = 0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
            {
                openIndex.add(i); 
            }
            else if(s.charAt(i)==')'){
                if(openIndex.size()>0){
                    openIndex.remove();
                }
                else{
                    closeIndex.add(i);
                } 
            } 
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c== '(' && openIndex.contains(i)){
                continue;
            }
            else if(c==')' && closeIndex.contains(i))
                continue;
            else
                sb.append(c);
        }
        return sb.toString();
    }
}