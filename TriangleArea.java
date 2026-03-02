import java.util.Scanner;
public class TriangleArea {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter base in cm: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = scanner.nextDouble();

        // Calculate area in square cm
        double areaSqCm = 0.5 * base * height;

        // Convert to square inches
        // 1 inch = 2.54 cm → 1 sq inch = (2.54 × 2.54) sq cm
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // Display result
        System.out.println(
            "The Area of the triangle in sq in is " + areaSqIn +
            " and sq cm is " + areaSqCm
        );

        scanner.close();
    }
}