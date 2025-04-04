public class 169. Majority Element {
    class Solution {
        public int majorityElement(int[] nums) {
            int n=nums.length;
            HashMap<Integer, Integer>hm=new HashMap<>();
            for(int num: nums){
                hm.put(num,hm.getOrDefault(num ,0)+1);
            }
            for(Integer a:hm.keySet()){
                if(hm.get(a) > (n/2)){
                    return a;
                }
            }
            return -1;
            
        }
    }
    
}
