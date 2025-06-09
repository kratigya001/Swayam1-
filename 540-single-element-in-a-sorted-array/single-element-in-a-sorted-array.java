class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>hm= new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);

        }
        for(int key:hm.keySet()){
            if(hm.get(key)==1){
                return key;
            }

        }
        return -1;
        
    }
}