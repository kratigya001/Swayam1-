package Swayam1-.04-02-2025;

public class 2078. Two Furthest Houses With Different Colors {
    class Solution {
        public int maxDistance(int[] colors) {
            int n=colors.length;
            int ans=0;
            for(int i=0;i<n;i++){
                if(colors[i] != colors[n-1]){
                   ans= Math.max(ans, n-1-i);
                   System.out.println(ans);
    
                }
                if(colors[i]!= colors[0]){
                    ans=Math.max(ans,i);
                    System.out.println(ans);
                }
            }
            return ans;
        }
    }
    
}
