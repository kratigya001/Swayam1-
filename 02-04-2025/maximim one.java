package Swayam1-.02-04-2025;

public class maximim one {
    import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            char[] ch = s.toCharArray();
            for (int i = n - 2; i >= 0; i--) {
                if (ch[i + 1] == '1' && k > 0 && ch[i] == '0') {
                    ch[i] = '1';
                    k--;
                }
            }

            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (ch[i] == '1') {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

    }
}
    
}
