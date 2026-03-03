import java.util.Scanner;
public class OddEvenPrinter {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if natural number
        if (number > 0) {

            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number");
                } else {
                    System.out.println(i + " is an Odd number");
                }

            }

        } else {

            System.out.println("The number " + number + " is not a natural number");
        }

        scanner.close();
    }
}