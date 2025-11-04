import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i : nums) mpp.put(i,mpp.getOrDefault(i,0)+1);
        PriorityQueue<Integer> pairs = new PriorityQueue<>((a,b)->Integer.compare(mpp.get(b),mpp.get(a)));
        for(int key : mpp.keySet()){
            pairs.add(key); 
        }
        int[] ans = new int[k];
        int count = 0;
        while(count < k && !pairs.isEmpty()){
            ans[count] = pairs.poll();
            count++; 
        }
        return ans;
    }
}