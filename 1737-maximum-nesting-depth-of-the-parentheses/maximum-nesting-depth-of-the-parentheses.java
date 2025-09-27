class Solution {
    public int maxDepth(String s) {
        int open=0;
        int res=0;

        for(char ch:s.toCharArray()){
            if(ch=='('){
                open++;
                res= Math.max(res,open);
            }
            else if(ch==')'){
                open--;
            }
        }
    
      return res;
    }
}