class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length;
        String first=strs[0];
        String last=strs[n-1];
        int i=0;
        while(i<first.length()  && first.charAt(i)==last.charAt(i)){
            i++;
        }
        return last.substring(0,i);
    }
}