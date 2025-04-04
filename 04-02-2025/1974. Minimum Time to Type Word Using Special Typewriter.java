package Swayam1-.04-02-2025;

public class 1974. Minimum Time to Type Word Using Special Typewriter {
    class Solution {
        public int minTimeToType(String word) {
            int count=word.length(); // for type
            int start='a';
    
            for(char ch : word.toCharArray()){
                int diff=Math.abs(ch- start);
                count += Math.min(diff, 26-diff); // min move
                start=ch;
            }
            return count;
            
        }
    }
    
}
