// Last updated: 3/26/2026, 1:49:22 AM
class Solution {
    public int minSetSize(int[] arr) {
        if(arr.length == 0)
            return 0;
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int a : arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
  
        List<Integer> valueCounts = new ArrayList<>(map.values());
        Collections.sort(valueCounts);
        Collections.reverse(valueCounts);
        int half = 0;
        int count = 0;
        int i=0;
        while(i<valueCounts.size() && half < arr.length/2){
           // System.out.println(half + "  " + queue.peek());
            half+= valueCounts.get(i);
            count++;
            i++;
        }
        return count;
    }
}