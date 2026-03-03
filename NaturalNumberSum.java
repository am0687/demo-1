import java.util.Scanner;
public class NaturalNumberSum {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if natural number (positive integer)
        if (number > 0) {

            // Formula: n * (n + 1) / 2
            int sum = number * (number + 1) / 2;

            System.out.println(
                "The sum of " + number + " natural numbers is " + sum
            );

        } else {

            System.out.println(
                "The number " + number + " is not a natural number"
            );
        }

        scanner.close();
    }
}