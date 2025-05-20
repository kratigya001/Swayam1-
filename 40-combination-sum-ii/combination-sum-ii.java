class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>res= new ArrayList<>(); 
        List<Integer>ans= new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,res,ans,0);
        return res;
        
    }
    private void helper(int [] nums,int k, List<List<Integer>>res, List<Integer>ans,int i){
        if(k==0){
            res.add(new ArrayList<>(ans));
            return;
        }
        if(k <0){
            return ;
        }
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1]){
                continue;

            }

            
            ans.add(nums[j]);
            helper(nums,k-nums[j],res,ans,j+1);
            ans.remove(ans.size()-1); //backtarck
        }

    }
}