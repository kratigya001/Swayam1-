class Solution {
    HashSet<List<Integer>>hs= new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>res= new ArrayList<>();
        List<Integer>ans= new ArrayList<>();
        helper(res,ans,nums,0);
        return res;
        
    }
    private void helper(List<List<Integer>>res,List<Integer>ans,int []nums,int i){
        //base
        if(i==nums.length){
           if(!hs.contains(ans)){
               res.add(new ArrayList<>(ans));
               hs.add(ans);
           }
         return;
           
        }
        ans.add(nums[i]);
        helper(res,ans,nums,i+1);
        ans.remove(ans.size()-1);
        helper(res,ans,nums,i+1);



    }
}