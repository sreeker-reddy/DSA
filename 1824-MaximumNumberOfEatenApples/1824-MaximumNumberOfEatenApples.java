// Last updated: 3/26/2026, 1:47:47 AM
class Solution {
    public int eatenApples(int[] apples, int[] days) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        int fruitCount = 0;
        
        for(int currentDay = 0;currentDay<days.length || !map.isEmpty(); currentDay++){
            if(currentDay < apples.length){
                int currentExp = currentDay+days[currentDay];
                map.put(currentExp, map.getOrDefault(currentExp,0) + apples[currentDay]);
            }
            while(!map.isEmpty() && map.firstEntry().getKey() <= currentDay)
                map.remove(map.firstEntry().getKey());
            
            if(!map.isEmpty()){
                int latestExp = map.firstEntry().getKey();
                fruitCount++;
                if(map.get(latestExp) > 1){
                    map.put(latestExp, map.get(latestExp)-1);
                }
                else
                    map.remove(latestExp);
            }
        }
        return fruitCount;
    }
}