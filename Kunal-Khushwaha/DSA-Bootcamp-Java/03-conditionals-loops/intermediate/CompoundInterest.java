package intermediate;

import java.util.Scanner;

// Calculate Compound Interest
public class CompoundInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter time: ");
        double t = sc.nextDouble();

        double A = p * (Math.pow((1 + (r/100)), t));

        double compoundInterest = A - p;
        System.out.println("Compund Interest: " + compoundInterest);
    }
}
