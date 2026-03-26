// Last updated: 3/26/2026, 1:50:07 AM
class Solution {
    public int maxNumberOfBalloons(String text) {
        int count = 0;
        char[] str = text.toCharArray();
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        
        for(Character c : str){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        
        String balloon = "balloon";
        char[] bal = balloon.toCharArray();
        HashMap<Character,Integer> map1 = new HashMap<Character, Integer>();
        
        for(Character c : bal){
            map1.put(c,map1.getOrDefault(c,0) + 1);
        }
        
        int max = Integer.MAX_VALUE;
        
        Iterator iter = map1.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry = (Map.Entry) iter.next();
            Character key = (Character) entry.getKey();
            int cnt = (int) entry.getValue();
            
            
            int c1 = map.getOrDefault(key,0);
            //System.out.println(c1 + "  " + cnt);
            if(c1 < cnt)
                return 0;
            else if(c1 == cnt)
                max = 1;
            else if(c1 > 0){
                max = Math.min(max,c1/cnt);
            }
                
        }
        
     
        
        return max;
        
    }
}