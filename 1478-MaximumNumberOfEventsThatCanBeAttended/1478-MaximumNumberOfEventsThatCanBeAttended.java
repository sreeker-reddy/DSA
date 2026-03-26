// Last updated: 3/26/2026, 1:49:16 AM
class Solution {
    public int maxEvents(int[][] events) {
       Map<Integer,List<Integer>> map = new HashMap<>();
        int maxDay = 0;
        for(int[] event : events){
            maxDay = Math.max(maxDay,event[1]);
            
            if(!map.containsKey(event[0])){
                map.put(event[0],new ArrayList<Integer>());
            }
            List<Integer> current = map.get(event[0]);
            current.add(event[1]);
            map.put(event[0],current);
        }
        
        int eventCount = 0;
        int currentDay = 1;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        while(currentDay<=maxDay){
            boolean canAttend = false;
            
            if(map.containsKey(currentDay)){
                queue.addAll(map.get(currentDay));
            }
            while(!queue.isEmpty()){
                int endTime = queue.poll();
                if(endTime >= currentDay){
                    canAttend = true;
                    break;
                }
            }
            if(canAttend){
                eventCount++;
            }
            currentDay++;
        }
        return eventCount;
    }
}