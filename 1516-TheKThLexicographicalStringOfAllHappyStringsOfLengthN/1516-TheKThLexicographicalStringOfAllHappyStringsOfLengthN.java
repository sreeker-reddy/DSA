// Last updated: 3/26/2026, 1:48:34 AM
class Solution {
    int target = 0;
    String str = "";
    public String getHappyString(int n, int k) {
        String source = "abc";
        backtrack(source,0, new StringBuilder(),n,k);
        return str;
    }
    
    public void backtrack(String source, int startIndex, StringBuilder sb, int n, int k){
        if(sb.length()==n){
            target++;
            if(target == k)
                str = sb.toString();
            return;
        }
        for(int i=startIndex;i<source.length();i++){
            if(sb.length() == 0 || sb.charAt(sb.length()-1)!=source.charAt(i)){
                sb.append(source.charAt(i));
                backtrack(source,0,sb,n,k);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}