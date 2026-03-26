// Last updated: 3/26/2026, 1:50:02 AM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new LinkedList<>();
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1]) < minDiff){
                minDiff = Math.abs(arr[i]-arr[i+1]);
            }
        }
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1]) == minDiff){
                List<Integer> res = new LinkedList<>();
                res.add(arr[i]);
                res.add(arr[i+1]);
                result.add(res);
            }
        }
       // System.out.println(minDiff);
        return result;
    }
}