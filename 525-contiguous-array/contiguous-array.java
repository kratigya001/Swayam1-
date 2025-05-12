class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int sum=0;
        int maxlen=0;
        //int count=0;
        HashMap<Integer,Integer>hm= new HashMap<>();
        hm.put(0,-1);//value,index
        for(int i=0;i<n;i++){
            sum+= (nums[i]==1)?1:-1;
            if(hm.containsKey(sum)){
               maxlen=Math.max(maxlen, i-hm.get(sum)); // end -start
            }
            else{
                hm.put(sum,i);
            }
           // max= Math.max(max,count);
        }
        return maxlen;
        
    }
}