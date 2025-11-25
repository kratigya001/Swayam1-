class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        //Integer.bitCount(i) is built-in method that counts how many 1 are present in the binary representation of i.

        int sum=0;
        for(int i=0;i<nums.size();i++){
            int bit= Integer.bitCount(i); //all index binary 
            if(bit == k){
                sum+= nums.get(i);
            }
        }
        return sum;
        
        
    }
}