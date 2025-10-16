class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>hs= new HashSet<>();
        while(n!=1){
            int sum=0;
            int temp=n;

           // Sum of squares of digits
            while(temp>0){
               int d= temp%10;
               temp=temp/10;
               sum+= d*d;
            }
            if(hs.contains(sum)){
                return false; // cycle detected
            }
            hs.add(sum);
            n=sum;
            


        }
        return true;//reach 1 
        
    }
}