class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int lp=1;
        int rp=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            lp= lp==0?1:lp;//for handling 0 in array
            rp= rp==0?1:rp;

            lp *= nums[i];
            rp *= nums[n-1-i];
            ans= Math.max(ans,Math.max(lp,rp));
        }
        return ans;
        
    }
}