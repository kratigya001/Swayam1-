class Solution {
        HashSet<List<Integer>>hs = new HashSet<>();//unique

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>ans= new ArrayList<>();
        helper(candidates,target,res,ans,0);
        return res;

        
    }
    private void helper(int[] nums, int target,List<List<Integer>>res,  List<Integer>ans, int i){
        if(i >= nums.length || target < 0){
            return;
        }

        if(target== 0){
            if(!hs.contains(ans)){
              res.add(new ArrayList<>(ans));
              hs.add(new ArrayList<>(ans));
              return;
            }
            
        }
        ans.add( nums[i]);
        helper(nums,target-nums[i],res,ans,i+1);//single time include
        helper(nums,target-nums[i],res,ans,i);//multiple time include
        ans.remove(ans.size()-1);
        helper(nums,target,res,ans,i+1);//exclude

    }
}
