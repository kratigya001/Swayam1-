import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i : nums) mpp.put(i,mpp.getOrDefault(i,0)+1);
        PriorityQueue<int[]> pairs = new PriorityQueue<>((a,b)->Integer.compare(b[1],a[1]));
        for(int key : mpp.keySet()){
            pairs.add(new int[]{key,mpp.get(key)}); 
        }
        int[] ans = new int[k];
        int count = 0;
        while(count < k && !pairs.isEmpty()){
            int[] temp = pairs.poll();
            ans[count] = temp[0];
            count++; 
        }
        return ans;





    }
}