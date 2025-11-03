class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer>pq= new PriorityQueue<>(Collections.reverseOrder());
        int freq[]= new int[26];
        int time=0;
        for(char t:tasks){
            freq[t-'A']++; //calculate freq
        }
        for(int f:freq){
            if(f>0){
                pq.add(f); //pq m add
            }
        }
        while(!pq.isEmpty()){
            ArrayList<Integer>temp= new ArrayList<>();
            for(int i=1;i<= n+1 ;i++){
               if(!pq.isEmpty()){
                 int top=pq.poll();
                 top--;
                 temp.add(top);
               }
            }
            for(int remaining: temp){
                if (remaining>0) pq.add(remaining);
            }
            if(pq.isEmpty()){
                time+= temp.size();

            }
            else{
                time+= 1+n ;
            }

        }
        return time;


    }
}