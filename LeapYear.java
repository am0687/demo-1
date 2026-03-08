import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take year input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check Gregorian calendar condition
        if (year < 1582) {
            System.out.println("Please enter a year >= 1582");
        } 
        else {

            // -------- Part 1 : Multiple if-else --------
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Part 1: Year is a Leap Year");
                    } else {
                        System.out.println("Part 1: Year is not a Leap Year");
                    }
                } else {
                    System.out.println("Part 1: Year is a Leap Year");
                }
            } else {
                System.out.println("Part 1: Year is not a Leap Year");
            }

            // -------- Part 2 : Single if with logical operators --------
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Part 2: Year is a Leap Year");
            } else {
                System.out.println("Part 2: Year is not a Leap Year");
            }

        }

        sc.close();
    }
}