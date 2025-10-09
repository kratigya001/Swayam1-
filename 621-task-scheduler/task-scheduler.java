class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[]= new int [26];
            int time=0;

        //calculate freq
        for(char t:tasks){
            freq[t-'A']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //maxheap
        for(int f:freq){
            if(f>0)  pq.add(f);
        }

        while(!pq.isEmpty()){
            ArrayList<Integer>temp= new ArrayList<>();
            for(int i=1;i<=1+n;i++){//execute n+1 task
               if(!pq.isEmpty()){
                    int top=pq.poll();
                    top--;
                    temp.add(top);
               }
            }

            for(int remaining:temp){
                if(remaining >0) pq.add(remaining);
            }
        
        
             if(pq.isEmpty()){
                time+=temp.size();
             }
             else{
                time+= 1+n;
             }
        }
             
        return time;

    }
}