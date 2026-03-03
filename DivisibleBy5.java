import java.util.Scanner;
public class DivisibleBy5 {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check divisibility
        boolean isDivisible = (number % 5 == 0);

        // Display result
        System.out.println(
            "Is the number " + number + " divisible by 5? " + isDivisible
        );

        // Close scanner
        scanner.close();
    }
}