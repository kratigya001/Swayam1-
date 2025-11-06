class Solution {
    public char findTheDifference(String s, String t) {
        //ascii value 
        int tsum=0;
        int ssum=0;

       for(char c:s.toCharArray()){
          ssum+= c;
       }

        for (char a:t.toCharArray()){
            tsum+= a;

        }
        return (char) (tsum-ssum);

        
    }
}