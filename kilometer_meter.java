import java.util.*;
public class kilometer_meter{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter distance in kilometer:");

        double kilometer = sc.nextDouble();

        
        double m = kilometer * 1000;
        double cm = kilometer * 100000;
        double mm = kilometer * 1000000;

        
        System.out.println(kilometer + " km = " + m + " m");
        System.out.println(kilometer + " km = " + cm + " cm");
        System.out.println(kilometer + " km = " + mm + " mm");
        

        
    }
}