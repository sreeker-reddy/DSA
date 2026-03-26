// Last updated: 3/26/2026, 1:49:25 AM
class Solution {
    public int numberOfSteps (int num) {
        int count = 0;
        while(num>0){
            if(num%2==0)
                num=num/2;
            else
                num=num-1;
            count++;
        }
        return count;
    }
}