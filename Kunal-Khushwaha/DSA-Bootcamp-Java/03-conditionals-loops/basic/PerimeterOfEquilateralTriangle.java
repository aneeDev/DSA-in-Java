package basic;

import java.util.Scanner;

// Perimeter Of Equilateral Triangle
public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {

        System.out.println("========= \t PERIMETER OF EQUILATERAL TRIANGLE \t =========");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of equilateral triangle: ");
        double a = sc.nextDouble();

        double p = 3 * a;
        System.out.println("Perimeter of equilateral triangle = " + p);
    }
}
