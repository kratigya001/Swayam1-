class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int cs=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            cs += nums[i];
            if (cs<0){
                cs=0;
            }
            maxsum= Math.max(maxsum,cs);

        }
        if (maxsum == 0){
            int min2=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                min2=Math.max(min2, nums[i]);
            }
            return min2;

        }
        else{
            return maxsum;
        }
    }
}