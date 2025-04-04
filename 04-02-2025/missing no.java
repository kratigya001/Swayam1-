package Swayam1-.04-02-2025;

public class missing no {
    class Solution {
        public int missingNumber(int[] nums) {
            int n=nums.length;
    
            HashSet<Integer>hs=new HashSet<>();
            for(int i=0;i<=n;i++){
                hs.add(i);
            }
            for(int num: nums){
                hs.remove(num);
            }
            return hs.iterator().next(); //removes the single element that is left
    
        }
    }
    
}
