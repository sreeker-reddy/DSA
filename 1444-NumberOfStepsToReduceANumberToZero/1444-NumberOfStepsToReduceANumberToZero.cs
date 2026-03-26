// Last updated: 3/26/2026, 1:49:28 AM
public class Solution {
    public int NumberOfSteps (int num) {
        int stepCount=0;
        
        while(num!=0)
        {
            if((num%2)==0)
                num=num/2;
            else
                num-=1;
            
            stepCount++;
        }
        
        return stepCount;
    }
}