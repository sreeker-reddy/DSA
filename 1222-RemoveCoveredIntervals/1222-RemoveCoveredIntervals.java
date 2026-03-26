// Last updated: 3/26/2026, 1:50:27 AM
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        if(intervals.length == 0)
            return 0;
        Arrays.sort(intervals, new Comparator<int[]>(){
            @Override
            public int compare(int[] a1 , int[] a2){
                return a1[0]==a2[0] ? a2[1]-a1[1] : a1[0]-a2[0];
            }
        });
        int[] prev = intervals[0];
        int count = 1;
        
        for(int i=1;i<intervals.length;i++){
            int[] current = intervals[i];
            if(current[1] > prev[1]){
                count++;
                prev = current;
            }
        }
        return count;
    }
}

/*
[3,10], [4,10], [5,11]

prev = [3,10]

if current[0] >=prev && current[1]<=prev[1]
*/