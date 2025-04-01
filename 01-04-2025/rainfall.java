package Swayam1-.01-04-2025;

public class rainfall {
    import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[12]; // Array for 12 months

        // Input for 12 months
        for (int i = 0; i < 12; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize sum, min, and max
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE; // Use Integer.MIN_VALUE for correct comparison

        // Compute sum, min, and max
        for (int i = 0; i < 12; i++) {
            sum += arr[i];
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        // Calculate average
        int avg = sum / 12;

        // Find and print the months with max rainfall
        System.out.print("Max rainfall in month(s): ");
        for (int i = 0; i < 12; i++) {
            if (arr[i] == max) { // Corrected comparison
                System.out.print((i + 1) + " "); // Print month (1-based index)
            }
        }
        System.out.println(); // Move to new line

        // Output results
        System.out.println("Sum is: " + sum);
        System.out.println("Avg is: " + avg);
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);

        sc.close(); // Close Scanner
    }
}

    
}
