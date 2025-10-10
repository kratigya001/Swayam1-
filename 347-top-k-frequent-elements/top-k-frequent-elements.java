class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hm= new HashMap<>();
        int n=nums.length;
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
            
        }
        PriorityQueue<Integer>pq= new PriorityQueue<>((a,b)-> hm.get(b)-hm.get(a));//max heap based on freq
        pq.addAll(hm.keySet());

        int res[]= new int [k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll();

        }
        return res;


        
    }
}