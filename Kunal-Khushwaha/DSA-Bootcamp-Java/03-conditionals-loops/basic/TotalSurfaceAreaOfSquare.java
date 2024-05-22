package basic;

import java.util.Scanner;

// Total Surface Area of Square
public class TotalSurfaceAreaOfSquare {

    public static void main(String[] args) {

        System.out.println("========= \t TOTAL SURFACE AREA OF SQUARE \t =========");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square: ");
        double a =  sc.nextDouble();

        double tsa = 6 * a * a;
        System.out.println(" Total surface area of Square = " + tsa);
    }
}
