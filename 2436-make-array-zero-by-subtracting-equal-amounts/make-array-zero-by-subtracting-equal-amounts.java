class Solution {
    public int minimumOperations(int[] nums) {
        //we find unique non zero elelmnt
        HashSet<Integer>hs= new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            hs.add(nums[i]);

        }
        hs.remove(0);
        return hs.size();
    }
}