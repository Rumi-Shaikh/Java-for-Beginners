import java.util.*;

public class cel_farh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Celsius: ");

        double C = sc.nextDouble();  // better to use double for decimal values

        double F = (9.0 / 5.0) * C + 32;  // use 9.0/5.0 to avoid integer division

        System.out.println("Fahrenheit: " + F);

        sc.close(); // good practice to close Scanner
    }
}
