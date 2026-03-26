// Last updated: 3/26/2026, 1:49:34 AM
class Solution {
    int count = 0;
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        for(int size=minSize;size<=maxSize;size++){
            freqHelper(s,maxLetters,size);
        }
        return count;
    }
    
    private void freqHelper(String s, int maxLetters, int size){
        Map<String,Integer> freq = new HashMap<>();
        Map<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            if(i<size-1){
                continue;
            }
            if(map.size()<=maxLetters){
                String str = s.substring(i-size+1,i+1);
                freq.put(str, freq.getOrDefault(str,0)+1);
            }
            c = s.charAt(i-size+1);
            map.put(c,map.get(c)-1);
            if(map.get(c)==0){
                map.remove(c);
            }
        }
        
        for(int f : freq.values()){
            count = Math.max(count,f);
        }
    }
}