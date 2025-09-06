class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer>al=new ArrayList<>();
        for(int s:stones){
            al.add(s);
        }
        while(al.size()>1){
            Collections.sort(al);
            int a=al.remove(al.size()-1); //heaviest
            int b=al.remove(al.size()-1);  //second heavy
            if(a!=b){
                al.add(a-b);
            }


        }
        return al.isEmpty()?0 :al.get(0);
        
     
        
    }
}