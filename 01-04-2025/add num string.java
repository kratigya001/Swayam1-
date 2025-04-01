package Swayam1-.01-04-2025;

public class add num string {
    import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a string: ");
        String s = sc.next();  // Read input string

        int sum = 0;
        int num = 0;

        // Process each character
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');  // Form numbers from digits
            } else {
                sum += num;  // Add formed number to sum
                num = 0;      // Reset num for the next number
            }
        }
        sum += num; // Add the last number

        // Output the final sum
        System.out.println("Sum is: " + sum);

        sc.close(); // Close Scanner
    }
}

    
}
