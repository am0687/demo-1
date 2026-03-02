import java.util.Scanner;
public class TemperatureConversion2 {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take Fahrenheit input
        System.out.print("Enter temperature in fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert to Celsius using formula
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Display result
        System.out.println(
            "The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius"
        );

        // Close scanner
        scanner.close();
    }
}