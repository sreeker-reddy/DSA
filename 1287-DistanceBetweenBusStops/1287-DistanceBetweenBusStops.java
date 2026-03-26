// Last updated: 3/26/2026, 1:50:12 AM
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum1 = 0;
        int sum2 = 0;
        if(start > destination){
            int temp = start;
            start = destination;
            destination = temp;
        }
        
        for(int i=0;i<distance.length;i++){
            if(i>=start && i<destination)
                sum2+=distance[i];
            sum1+=distance[i];
        }
        return Math.min(sum1-sum2,sum2);
    }
}
