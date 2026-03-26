// Last updated: 3/26/2026, 1:50:16 AM
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        int currentRank = 1;
        HashMap<Integer,Integer> rankMap = new HashMap<Integer,Integer>();
        
        for(int i=0;i<arr.length;i++){
            if(!rankMap.containsKey(temp[i])){
                rankMap.put(temp[i],currentRank);
                currentRank++;
            }
            
        }
      
        for(int i=0;i<arr.length;i++){
            arr[i] = rankMap.get(arr[i]);
        }
        return arr;
    }
}