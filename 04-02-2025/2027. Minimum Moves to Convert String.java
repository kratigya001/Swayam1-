package Swayam1-.04-02-2025;

public class 2027. Minimum Moves to Convert String {
    class Solution {
        public int minimumMoves(String s) {
            int n = s.length();
            int i = 0;
            int count = 0;
            while (i < s.length()) {
                if (s.charAt(i) == 'X') {
                    i = i + 3;
                    count++;
                } else {
                    i++;
                }
    
            }
            return count;
    
        }
    }
    
}
