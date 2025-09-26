class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm= new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        PriorityQueue <Character> pq= new PriorityQueue<>((a,b) -> hm.get(b)-hm.get(a));//Max-heap by frequency (largest freq first 
        pq.addAll(hm.keySet());

        StringBuilder sb= new StringBuilder();
        while(!pq.isEmpty()){
            char c=pq.poll();
            int count=hm.get(c);
            for(int i=0;i<count;i++){
                sb.append(c);
            }

        }
        return sb.toString();

    }
}