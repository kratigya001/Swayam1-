class Solution {
    public int lengthOfLongestSubstring(String s) {
        //brute
        int n=s.length();
        if(n==0) return 0;
        int len=1;
        for(int i=0;i<n;i++){
            int hash[]=new int [256];
            for(int j=i;j<n;j++){
                hash[s.charAt(j)]++;
                if(hash[s.charAt(j)]==2){
                    break;
                }
                len=Math.max(len,j-i+1);
            }
        }
        return len;
        
    }
}