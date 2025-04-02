package Swayam1-.02-04-2025;

public class 2873. Maximum Value of an Ordered Triplet I {
    class Solution {
        public long maximumTripletValue(int[] nums) {
            int n=nums.length;
            long res=0;
            long maxdiff=0;
            long maxi=0;
            for(int i=0;i<n;i++){
                res=Math.max(res,maxdiff * nums[i]);
                maxdiff=Math.max(maxdiff, maxi-nums[i]);
                maxi=Math.max(maxi ,(long) nums[i]);
            }
            return res;
            
        }
    }
    
}
