class Solution {
    public String reverseWords(String s) {
        String words[]=s.split(" ");
        StringBuilder res= new StringBuilder();
        for (String str:words){
            String rev=new StringBuilder(str).reverse().toString();
            res.append(rev).append(" ");
        }
        return res.toString().trim();


    }
}