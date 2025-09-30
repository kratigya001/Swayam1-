class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer>hm = new HashMap<>();
        int n=nums.length;
        int ans[]= new int [2];
        for(int i=0;i<n;i++){
            int need=target- nums[i];
            if(hm.containsKey(need)){
                ans[0]=i;
                ans[1]=hm.get(need);

            }
            else{
                hm.put(nums[i],i);
            }


        }
        return ans;

        
    }
}