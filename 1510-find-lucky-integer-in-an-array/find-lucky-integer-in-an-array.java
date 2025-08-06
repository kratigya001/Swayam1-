class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer>hm= new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int result=-1;
        for(int a:hm.keySet()){
            if(a==hm.get(a)){
                result= Math.max(a,result);
            }
        }
        return result;
        
    }
}