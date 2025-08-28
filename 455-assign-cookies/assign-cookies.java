class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i=0,j=0;
        int cnt=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<g.length && j<s.length){
            if(s[j] >= g[i]){
                cnt++;
                i++;
                j++;
            }
            else{
                j++; //move only cookies 
            }
        }
        return cnt;

        
    }
}