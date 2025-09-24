class Solution {
    public String decodeString(String s) {
        Stack <StringBuilder> strstk= new Stack<>();
        Stack <Integer> numstk= new Stack<>();
        StringBuilder currstr= new StringBuilder();
        int num=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+ (c-'0');
            }
            else if(c=='['){
                numstk.push(num);
                num=0;
                strstk.push(currstr);
                currstr=new StringBuilder();

            }
            else if(c==']'){
                int k=numstk.pop();
                StringBuilder temp= strstk.pop();

                for(int i=0;i<k;i++){
                    temp.append(currstr);
                }
                currstr=temp;

            }
            else{
                currstr.append(c);
            }
        }
        return currstr.toString();

    }
}