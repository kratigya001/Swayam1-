class Solution {
    public boolean checkValidString(String s) {
        
        Stack<Integer> open = new Stack<>(); // store indices of '('
        Stack<Integer> star= new Stack<>();// store indices of '*'

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open.push(i);
            }
            else if(ch=='*'){
                star.push(i);
            }
            else{//')'
                if(!open.isEmpty()){
                    open.pop(); // match with '('
                }
                else if(!star.isEmpty()){
                    star.pop();// use '*' as '('

                }
                else{
                    return false;
                }
            }
          
        }
        while(!open.isEmpty() && !star.isEmpty()){
            if(open.peek() > star.peek()){ // '(' must come before '*' to match as ques
                return false;

            }
            else{
                star.pop();
                open.pop();
            }
        }
        return open.isEmpty(); //true

    }
}