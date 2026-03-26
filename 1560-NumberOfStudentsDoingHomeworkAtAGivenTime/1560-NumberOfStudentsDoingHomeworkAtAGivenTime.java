// Last updated: 3/26/2026, 1:48:24 AM
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for(int i=0;i<startTime.length;i++){
            if(startTime[i]<=queryTime && endTime[i] >=queryTime)
                count++;
        }
        return count;
    }
}