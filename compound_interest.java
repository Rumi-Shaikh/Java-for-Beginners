import java.util.*;
public class compound_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount,Principal,Rate,Time");
        double A = sc.nextDouble();
        double P = sc.nextDouble();
        double R = sc.nextDouble();
        double T = sc.nextDouble();

        double Amount =  P * Math.pow((1 + R / 100),T);

        double compound_interest = Amount-P;

        System.out.println("Compund Interest:"+compound_interest);
    }
    
}
