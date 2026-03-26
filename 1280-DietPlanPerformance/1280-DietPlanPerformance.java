// Last updated: 3/26/2026, 1:50:10 AM
class Solution {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int count = 0;
        for(int i=0;i<calories.length-k+1;i++){
            int sum =0;
            for(int j=i;j<i+k && j<calories.length;j++)
            {
                sum+=calories[j];
            }  
            if(sum < lower){
                count-=1;
            }
            if(sum>upper)
                count+=1;
        }
        return count;
    }
}