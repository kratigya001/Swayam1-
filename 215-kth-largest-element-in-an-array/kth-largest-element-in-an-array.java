class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq= new PriorityQueue<>(Collections.reverseOrder());//max heap
        int n=nums.length;
        for(int i=0;i<n;i++){
            pq.add(nums[i]);
        }

         //Remove top (max) k-1 elements
        for(int i=0;i<k-1;i++){
            pq.remove();
        }
        return pq.peek();

        
    }
}