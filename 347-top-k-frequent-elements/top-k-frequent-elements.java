class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hm= new HashMap<>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        PriorityQueue<Integer>pq= new PriorityQueue<>((a,b)-> hm.get(b)- hm.get(a));//max heap
        for(int key:hm.keySet()){
            pq.add(key);
        }
        int temp[]=new int [k];
        for(int i=0;i<k;i++){
            temp[i]=pq.poll();
        }
        return temp;

    }
}