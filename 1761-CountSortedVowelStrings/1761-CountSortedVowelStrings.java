// Last updated: 3/26/2026, 1:47:54 AM
class Solution {
    int count;
    public int countVowelStrings(int n) {
       // StringBuilder sb = new StringBuilder();
         count = 0;
        char[] alphabets = new char[]{'a','e','i','o','u'};
        countVowelStringsHelper(alphabets,new StringBuilder(),n,0);
        return count;
    }
    
    private void countVowelStringsHelper(char[] alphas, StringBuilder sb,int n, int index){
        if(sb.length() == n){
          //  System.out.println(sb.toString());
            count++;
            return;
        }
        for(int i=0;i<alphas.length;i++){
            if(i>=index){
               sb.append(alphas[i]);
                countVowelStringsHelper(alphas,sb,n,i);
                sb.deleteCharAt(sb.length()-1); 
            }
            
        }
    }
}