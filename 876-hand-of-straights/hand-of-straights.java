class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int len=hand.length;
        if(len%groupSize !=0){
            return false;
        }
        TreeMap<Integer,Integer> hm= new TreeMap<>();
        for(int i=0;i<len;i++){
            hm.put(hand[i],hm.getOrDefault(hand[i],0)+1);
        }
        while(!hm.isEmpty()){
             int first= hm.firstKey();
             for(int i=0;i<groupSize;i++){
                int curr=first+i ;
                if(!hm.containsKey(curr)){
                    return false;

                }
                hm.put(curr,hm.get(curr)-1);
                if(hm.get(curr)==0) hm.remove(curr);
             }
        }
        return true;
                
        
    }
}