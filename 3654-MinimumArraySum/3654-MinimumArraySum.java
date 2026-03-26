// Last updated: 3/26/2026, 1:47:21 AM
class Solution {
    public static int solve(int nums[],int idx,int k,int op1,int op2,int[][][] dp){
        if(idx==nums.length)
        return 0;
        if(dp[idx][op1][op2]!=-1)
        return dp[idx][op1][op2];
        //case-1 only op1
        int ans=Integer.MAX_VALUE;
        if(op1!=0){
        int op1Ans=((int)Math.ceil(nums[idx]/2.00))+solve(nums,idx+1,k,op1-1,op2,dp);
        dp[idx][op1][op2]=ans=Math.min(ans,op1Ans);
        }
        //case-2 onpy op2
        if(op2!=0 && nums[idx]>=k){
        int op2Ans=(nums[idx]-k)+solve(nums,idx+1,k,op1,op2-1,dp);
        dp[idx][op1][op2]=ans=Math.min(ans,op2Ans);
        }

        
        if(op1!=0 && op2!=0){
            //case-3 op1 then op2
            int afterOp1=(int)Math.ceil(nums[idx]/2.00);
            if(afterOp1>=k){
                int op1Aop2=(afterOp1-k)+solve(nums,idx+1,k,op1-1,op2-1,dp);
                dp[idx][op1][op2]=ans=Math.min(ans,op1Aop2);
            }

            //case-4 op2 then op1
            if(nums[idx]>=k){
                int op2Aop1=((int)Math.ceil((nums[idx]-k)/2.00))+solve(nums,idx+1,k,op1-1,op2-1,dp);
                dp[idx][op1][op2]=ans=Math.min(ans,op2Aop1);
            }
        }
        //case-5 no operation
        int noOp=nums[idx]+solve(nums,idx+1,k,op1,op2,dp);
        dp[idx][op1][op2]=ans=Math.min(noOp,ans);
        return ans;

        

    }
    public int minArraySum(int[] nums, int k, int op1, int op2) {
        int dp[][][]=new int[nums.length][op1+1][op2+1];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=op1;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        int ans=solve(nums,0,k,op1,op2,dp);
        return ans;
    }
}