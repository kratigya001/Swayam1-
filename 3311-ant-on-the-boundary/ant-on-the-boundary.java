class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int counter = 0;
        int res = 0;
        for (int n=0;n<nums.length;n++) {
            counter += nums[n]; 
            if (counter == 0) {
                res++;
            }
        }
        return res;
    }
}