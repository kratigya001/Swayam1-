class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        HashMap<Integer,Integer>hm=new HashMap<>();

        for(int i=0;i<n;i++){
            int need=target-numbers[i];
            if(hm.containsKey(need)){
                return new int[]{(hm.get(need)+1), i+1};
            }
            else{
                hm.put(numbers[i],i);
            }
                    
        }
        return new int[]{0,0};
        
    }
}