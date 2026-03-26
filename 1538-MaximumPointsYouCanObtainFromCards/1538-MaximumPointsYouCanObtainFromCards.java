// Last updated: 3/26/2026, 1:48:29 AM
class Solution {
    int max = 0;
    public int maxScore(int[] cardPoints, int k) {
        int start = 0;
        int end = cardPoints.length-1;
       int[] leftSum = new int[k+1];
        int[] rightSum = new int[k+1];
        leftSum[0]=0;
        rightSum[0]=0;
        
        for(int i=0;i<k;i++){
            leftSum[i+1] = leftSum[i]+cardPoints[i];
            rightSum[i+1] = rightSum[i]+cardPoints[cardPoints.length-1-i];
        }
        
        int result = 0;
        
        for(int i=0;i<=k;i++){
            result  =Math.max(result,leftSum[i]+rightSum[k-i]);
        }
        return result;
      // return helper(cardPoints,k,0,start,end,0);
    }
    
    private int helper(int[] cardPoints, int k, int currentScore,int start, int end,int count){
        if(start>end)
            return currentScore;
        if(count ==k){
            return currentScore;
        }
        
        int score = Math.max(helper(cardPoints,k,currentScore+cardPoints[start],start+1,end,count+1), helper(cardPoints,k,currentScore+cardPoints[end],start,end-1,count+1));
            return score;
    }
}