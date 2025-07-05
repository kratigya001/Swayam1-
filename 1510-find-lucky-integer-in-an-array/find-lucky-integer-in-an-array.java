class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int num:arr){
            hm.put(num , hm.getOrDefault(num,0)+1);
        }
        int res=-1;
        for(Map.Entry<Integer,Integer>entry :hm.entrySet()){
            int num=entry.getKey();
            int freq=entry.getValue();
            if(num==freq){
                res= Math.max(num,res);

            }

        }
        return res;
        
    }
}