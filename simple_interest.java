import java.util.*;
public class simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Principal,Rate and Time:");
        double P = sc.nextDouble();
        double R = sc.nextDouble();
        double T = sc.nextDouble();

        double simple_interest = (P*R*T)/100;

        System.out.println("Simple Interest:"+simple_interest);

    }
    
}
