class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count=0;
        int sum=0;
        for(int x : nums){
            sum+= x;
            if(sum== 0){
                count++;
            }
        }
        return count;

        
    }
}