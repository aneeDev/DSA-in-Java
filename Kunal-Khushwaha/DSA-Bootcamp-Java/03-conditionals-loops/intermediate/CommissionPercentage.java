package intermediate;

import java.util.Scanner;

public class CommissionPercentage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total sale amount: ");
        double saleAmount = sc.nextDouble();
        System.out.print("Enter the commission rate: ");
        double rate = sc.nextDouble();

        double commissionAmount = saleAmount * (rate/100);
        System.out.println("Commission Percentage Amount: " + commissionAmount);
    }
}
