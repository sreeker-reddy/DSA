// Last updated: 3/26/2026, 1:50:09 AM
public class Solution {
    public int DistanceBetweenBusStops(int[] distance, int start, int destination) {
        int atobDistance = 0;
        int btoaDistance = 0;
        
        int tempStart = Math.Min(start,destination);
        int tempDestination = Math.Max(start,destination);
        
        start = tempStart;
        destination = tempDestination;
        
        for(int i=start;i<destination;i++)
        {
            atobDistance+=distance[i];
        }
        
        for(int i=destination; ((i)%distance.Length)!=start;i++)
        {
            btoaDistance+=distance[i%distance.Length];
        }
        
        return Math.Min(atobDistance, btoaDistance);
    }
}