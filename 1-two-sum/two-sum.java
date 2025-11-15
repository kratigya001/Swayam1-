class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> hm= new HashMap<>();
        int ans[]= new int [2];
        for(int i=0;i<n;i++){
            hm.put(nums[i], i);
        }
        for(int i=0;i<n;i++){
            int temp=target-nums[i];
            if(hm.containsKey(temp) && hm.get(temp)!=i ){
                ans[0]=i;
                ans[1]=hm.get(temp);
                
            }
        }
        return ans;


   
    }
}