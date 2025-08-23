import java.util.*;
public class profit_loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter SP and CP:");
        int SP = sc.nextInt();
        int CP = sc.nextInt();
        int profit = SP-CP;
        int loss = CP-SP;

        if(SP>CP){
            System.out.println("Profit!");
        }
        else if(SP<CP){
            System.out.println("LOss!");
        }
        else{
            System.out.println("No Profit No Loss");
        }
    
}
}

