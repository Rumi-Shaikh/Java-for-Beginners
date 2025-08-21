import java.util.*;
public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any 2 numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int Average = (num1+num2)/2;
        System.out.println("Average is:"+Average);
    }
    
}
