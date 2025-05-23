class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>res= new ArrayList<>();
        List<String>path= new ArrayList<>();
         solve(0,s,res,path);
         return res;

    }
    private void solve(int ind,String s,List<List<String>>res,     List<String>path){
        if(ind== s.length()){
            res.add (new ArrayList<>(path));
            return;
        }
        for(int j=ind;j<s.length();j++){
           if( ispalind(s,ind,j) ){
              path.add(s.substring(ind,j+1));
              solve(j+1,s,res,path);
              path.remove(path.size()-1);
           }
        }
    }
    boolean ispalind(String s,int start, int end){
        while(start<=end){
            if(s.charAt(start)!= s.charAt(end)){
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
}