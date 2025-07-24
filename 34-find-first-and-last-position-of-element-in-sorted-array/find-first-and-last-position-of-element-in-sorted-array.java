class Solution {
    public int[] searchRange(int[] nums, int target) {
         int n=nums.length;

        int lb=lowerbound(nums,target);
        int ub=upperbound(nums,target);
        if(lb==n || nums[lb] !=target){
            return new int []{-1,-1};
        }
        return new int []{lb,ub-1} ;
    }
    public int lowerbound(int[] nums,int target){
         int n=nums.length;

        int low=0;
        int high=n-1;
        int ans=n;//last value hoti h lb if target is not there in array

        while(low<=high){
            int mid=(low+high )/2;
            if(nums[mid] >= target) {
                ans=mid;
                high=mid-1;
            }  
            else{
                low=mid+1;

            } 
        }
         return ans;
                  
    }
    
     public int upperbound(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=n;

        while(low<=high){
            int mid=(low+high )/2;
            if(nums[mid] > target) {
                ans=mid;
                high=mid-1;
            }  
            else{
                low=mid+1;

            } 
        }
         return ans;
    }
}