import java.util.*;
public class subjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Subjects Marks:");

       System.out.print("Maths:");
        int Maths =sc.nextInt();

        System.out.print("Biology:");
        int Biology = sc.nextInt();

        System.out.print("Physics:");
        int Physics = sc.nextInt();

        System.out.print("Chemistry:");
        int Chemistry = sc.nextInt();

        System.out.print("English:");
        int English = sc.nextInt();

        int Total = Maths+Biology+Physics+Chemistry+English;

        int Average = Total / 5;

        int Percentage = (Total/500)*100;

        System.out.println("Total Marks = " + Total);
        System.out.println("Average Marks = " + Average);
        System.out.println("Percentage = " + Percentage + "%");

    }
    
}
