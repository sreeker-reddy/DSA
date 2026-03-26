// Last updated: 3/26/2026, 1:49:50 AM
class Solution {
    int maxLen;
    public int maxLength(List<String> arr) {
        if(arr.size()==0)
            return 0;
       // int maxLen = 0;
        helper(arr,0, new StringBuilder());
        return maxLen;
    }
    
    private void helper(List<String> arr, int index, StringBuilder sb){
        if(index == arr.size()){
            //System.out.println(sb.length());
            maxLen = Math.max(maxLen,sb.length());
          // return ;
        }
        else{
            String current = arr.get(index);
        
            if(isUnique(current, sb.toString())){
            //add it to current string
                sb.append(current);
                helper(arr,index+1,sb);
                sb.setLength(sb.length() - current.length());
            }
            helper(arr,index+1,sb);
        }
        
    }
    
    private boolean isUnique(String s1, String s2){
        int[] s1_count = new int[26];
        int[] s2_count = new int[26];
        
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(s1_count[c-'a']>0)
                return false;
            s1_count[c-'a']++;
        }
        
        for(int i=0;i<s2.length();i++){
            char c = s2.charAt(i);
            if(s2_count[c-'a']>0 || s1_count[c-'a'] > 0)
                return false;
            s2_count[c-'a']++;
        }
        
       /*  for(int i=0;i<s2.length();i++){
            char c = s2.charAt(i);
            if(s1_count[c-'a']>0)
                return false;
        }
        */
        return true;
    }
}