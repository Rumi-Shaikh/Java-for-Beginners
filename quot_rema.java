import java.util.*;
public class quot_rema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dividend and Divisor:");
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        int quoteint = dividend/divisor;
        int remainder = dividend%divisor;

        System.err.println("Quoteint:"+quoteint);
        System.err.println("Remainder"+remainder);
    }
    
}
