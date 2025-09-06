class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq= new PriorityQueue<>(Collections.reverseOrder());//max heap
        for(int s:stones){
            pq.add(s);
        }
        while(pq.size()>1){
            int a=pq.remove(); //top bcz of maxheap it is largest
            int b=pq.remove(); //second largest
            if(a!=b){
                pq.add(a-b);
            }
        }
        return pq.isEmpty()?0 :pq.peek();
        
    }
}