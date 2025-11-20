class Solution {
    public int romanToInt(String s) {
        int n=s.length();
        int ans=0;
        HashMap<Character,Integer>hm= new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        for(int i=0;i<n-1;i++){ //run upto  n-2 
            if(hm.get(s.charAt(i)) < hm.get(s.charAt(i+1))){
                ans=ans-hm.get(s.charAt(i));
            }
            else{
                ans= ans+ hm.get(s.charAt(i));
            }
        }
        return ans + hm.get(s.charAt(n-1)); //last vala add

    }
}