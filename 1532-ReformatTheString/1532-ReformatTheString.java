// Last updated: 3/26/2026, 1:48:31 AM
class Solution {
    public String reformat(String s) {
        List<Character> numbers = new LinkedList<>();
        List<Character> alphas = new LinkedList<>();
        
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(Character.isDigit(c))
                numbers.add(c);
            else
               alphas.add(c);
        }
        
        
        StringBuilder sb = new StringBuilder();
        if(Math.abs(numbers.size() - alphas.size()) >1)
            return "";
        else
        {
            boolean ischar = alphas.size() > numbers.size() ? true : false;
            int len = alphas.size() > numbers.size() ? alphas.size() : numbers.size();
            for(int i=0;i<len;i++){
                if(ischar){
                    if(i<alphas.size())
                        sb.append(alphas.get(i));
                    if(i<numbers.size())
                        sb.append(numbers.get(i));
                }
                else{
                     if(i<numbers.size())
                        sb.append(numbers.get(i));
                     if(i<alphas.size())
                        sb.append(alphas.get(i));
                }
                
            }
        }
        return sb.toString();
    }
}