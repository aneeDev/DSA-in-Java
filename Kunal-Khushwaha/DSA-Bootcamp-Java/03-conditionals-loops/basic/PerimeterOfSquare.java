package basic;

import java.util.Scanner;

// Perimeter of Square
public class PerimeterOfSquare {

    public static void main(String[] args) {

        System.out.println("========= \t PERIMETER OF SQUARE \t =========");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square: ");
        double a =  sc.nextDouble();

        double p = 4 * a;
        System.out.println("Perimeter of Square = " + p);
    }
}
