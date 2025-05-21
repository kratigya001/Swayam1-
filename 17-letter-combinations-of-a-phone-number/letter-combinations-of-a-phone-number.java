class Solution {
        List<String>result= new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        HashMap<Character,String>hm= new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        solve(0,digits,new StringBuilder(),hm);
        return result;

    }
    private void solve(int index,String digits, StringBuilder temp,HashMap<Character,String>hm){
        if(index >= digits.length()){
            result.add(temp.toString());
            return;
        }
        char ch=digits.charAt(index);
        String s=hm.get(ch);
        for(int i=0;i<s.length();i++){
            temp.append(s.charAt(i)); //try
            solve(index+1,digits,temp,hm);//explore
            temp.deleteCharAt(temp.length()-1);//backtrack
        }
    }
}