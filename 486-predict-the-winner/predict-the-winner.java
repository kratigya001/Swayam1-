class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        int diff=solve(nums,1,0,n-1,0,0);
        return diff>=0;

    }
    private int solve(int []nums,int player,int start,int end,int sum1,int sum2){
        if(start > end) {  //they are pointer and base case
            return sum1-sum2 ;
        }
        if(player==1){
            return Math.max(solve(nums,2,start,end-1,sum1+nums[end],sum2), solve(nums,2,start+1,end,sum1+nums[start],sum2));
        }
        else{
            return Math.min(solve(nums,1,start,end-1,sum1,sum2+nums[end]), solve(nums,1,start+1,end,sum1,sum2+nums[start]));
        }
    }
}