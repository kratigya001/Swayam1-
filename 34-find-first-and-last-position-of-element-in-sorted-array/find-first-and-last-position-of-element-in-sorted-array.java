class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first= -1;
        int end = -1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]== target){
                if(first== -1){
                    first= i;
                }
                end=i;
            }

        }
        return new int []{first, end};


    }
}