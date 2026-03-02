import java.util.Scanner;
public class TemperatureConversion {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take Celsius input
        System.out.print("Enter temperature in celsius: ");
        double celsius = scanner.nextDouble();

        // Convert to Fahrenheit using formula
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Display result
        System.out.println(
            "The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit"
        );

        // Close scanner
        scanner.close();
    }
}