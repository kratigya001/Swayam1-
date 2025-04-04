public class 2874. Maximum Value of an Ordered Triplet II {
    class Solution {
        public long maximumTripletValue(int[] nums) {
            long n=nums.length;
            long result=0;
            long maxdiff=0;
            long maxi=0;
            for(int i=0;i<n;i++){
                result=Math.max(result, maxdiff * nums[i]);
                maxdiff=Math.max(maxdiff, maxi -nums[i]);
                maxi=Math.max(maxi, (long) nums[i]);
            }
            return result;
            
        }
    }
    
}
