class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        if(n==1 ) return nums[0];
        while(low<=high){
            int mid=low+ (high-low) /2;
            
            if(mid==0 && nums[mid]!=nums[mid+1]) return nums[mid];
            if(mid==n-1 && nums[mid]!=nums[mid-1]) return nums[mid];

            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1] ) return nums[mid];

            if(mid%2==0){
                if(nums[mid]==nums[mid-1]){
                    high=mid-1; //left mai
                }
                else{
                    low=mid+1;//right m
                }
            }
            else{
                if(nums[mid]==nums[mid-1]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;

        
    }
}