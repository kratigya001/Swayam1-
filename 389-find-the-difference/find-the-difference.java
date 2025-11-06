class Solution {
    public char findTheDifference(String s, String t) {
        //xor
        int ans=0;
        for (char c:s.toCharArray()){
            ans=c^ans;
        }
        for(char c:t.toCharArray()){
            ans=c^ans;
        }
        return (char)ans;
    }
}