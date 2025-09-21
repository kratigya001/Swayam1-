class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int farthest= 0;
        int end=0;
        int jump=0;
        //last indx not take bcz we dont need to jump from last
        for(int i=0;i<=n-2;i++){ 
            farthest= Math.max(farthest, nums[i]+i);

            if(i== end){//we reached the end of the current jump range
                jump++;
                end=farthest;// move to farthest we can reach with this jump

            }
        }
        return jump;
        
        
    }
}