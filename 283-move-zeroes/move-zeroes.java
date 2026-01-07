class Solution {
    public void moveZeroes(int[] nums) {
        //2 pointer
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right] != 0){
                //swap
                int temp=nums[right];
                nums[right]= nums[left];
                nums[left]=temp;
                left++;

            }
        } 
    }
}