class Solution {
    ArrayList<Integer>al= new ArrayList<>();
    public int findTheWinner(int n, int k) {
        //josephs problem
        for(int i=1;i<=n;i++ ){
            al.add(i);
        }
        k= k-1; //0 based
       return solve(n,k,0);
        
    }
    public int  solve(int n,int k,int ind){
        if(al.size()==1){
            return al.get(0);
        }
        ind= (ind + k) % n; //circle 
        al.remove(ind);
       return solve(n-1,k,ind);

    }
}