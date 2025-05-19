class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans= new ArrayList<>();
        List<Integer>curr= new ArrayList<>();
        findsubset(nums,ans,curr,0);
        return ans;
    }
    private void findsubset(int[] nums,List<List<Integer>>ans ,List<Integer>curr, int i){
        //base case
        if(i==nums.length){
            ans.add(new ArrayList<>(curr));

            return ;
        }
        curr.add(nums[i]);
        findsubset(nums,ans,curr,i+1); //yes
        curr.remove(curr.size()-1);  //backtarck
        findsubset(nums,ans,curr,i+1);//no
    }
}