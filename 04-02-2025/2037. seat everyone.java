package Swayam1-.04-02-2025;

public class 2037. seat everyone {
    class Solution {
        public int minMovesToSeat(int[] seats, int[] students) {
            int s=students.length;
            int se=seats.length;
            int ans=0;
            Arrays.sort(seats);
            Arrays.sort(students);
            for(int i=0;i<s;i++){
                ans += Math.abs(seats[i]-students[i]);
    
            }
            return ans;
            
        }
    }
    
}
