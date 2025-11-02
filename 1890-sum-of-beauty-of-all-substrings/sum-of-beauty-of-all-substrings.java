class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            int freq[]=new int [26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++ ;
                int beauty= maxcount(freq)- mincount(freq);
                sum+= beauty;

            }
        }
        return sum;        
    }
    private int maxcount(int[] freq){
        int ans=0;
        for(int i=0;i<26;i++){
            ans=Math.max(ans,freq[i]);
        }
        return ans;

    }
    private int mincount(int[] freq){
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
          if(freq[i]!=0){
             ans=Math.min(ans,freq[i]);
          }
          

        }
        return ans;

            
        
    }
}