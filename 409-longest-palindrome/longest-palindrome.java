class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character>hs= new HashSet<>();
        int res=0;
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(hs.contains(ch)){
                hs.remove(ch);
                res += 2;

            }
            else{
                hs.add(ch);
            }
        }
        if(!hs.isEmpty()){ //for adding 1 from the remaing element that is come in middle any one of them
            res+= 1;
        }
        return res;

        
        
    }
}