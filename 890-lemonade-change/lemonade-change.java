class Solution {
    public boolean lemonadeChange(int[] bills) {
        //imagine as the notes of 5 , 10, 20
        // they are sorted
        int five=0;
        int ten=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five++;
            }
            else if (bills[i]==10){
                if(five==0) return false;
                ten++;
                five--;
            }
            else{//bills[i]==20
                if(five>0 && ten>0){
                    ten--;
                    five--;
                }
                else if(five >= 3){
                    five-=3;
                }
                else{
                    return false;
                }
            }
        }
         return true;

    }
}