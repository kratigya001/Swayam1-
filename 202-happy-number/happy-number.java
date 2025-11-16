class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs= new HashSet<>();
        while(n!= 1){
            int temp=n;
            int sum=0;
            while(temp>0){
                int d=temp % 10;
                temp=temp/10; //repeat jabatak temp > 0
                sum+= d*d;
            }
            if (hs.contains(sum)){
                return false;
            }
            hs.add(sum);
            n=sum ; //new number check again from very top
                

            
        }
        return true;
        
    }
}