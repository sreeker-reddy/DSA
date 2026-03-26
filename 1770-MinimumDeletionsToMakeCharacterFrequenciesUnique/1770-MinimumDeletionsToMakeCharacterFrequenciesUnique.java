// Last updated: 3/26/2026, 1:47:53 AM
class Solution {
    public int minDeletions(String s) {
        Map<Character,Integer> freqMap = new HashMap<>();
        
        for(char c : s.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        int delCount = 0;
        
        
        Set<Integer> freqSet = new HashSet<>();
        for(Map.Entry<Character,Integer> entry : freqMap.entrySet()){
            int currentFreq = entry.getValue();
            while(currentFreq>0 && freqSet.contains(currentFreq)){
                currentFreq--;
                delCount++;
            }
            freqSet.add(currentFreq);
        }
        
        return delCount;
        
        
    }
}