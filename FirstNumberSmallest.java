import java.util.Scanner;
public class FirstNumberSmallest {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();

        // Check if first number is the smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Display result
        System.out.println(
            "Is the first number the smallest? " + isSmallest
        );

        // Close scanner
        scanner.close();
    }
}