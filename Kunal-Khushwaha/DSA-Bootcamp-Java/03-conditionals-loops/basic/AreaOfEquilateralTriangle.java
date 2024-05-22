package basic;

import java.util.Scanner;

// Area Of Equilateral Triangle
public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {

        System.out.println("========= \t AREA OF EQUILATERAL TRIANGLE \t =========");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of equilateral triangle: ");
        double a = sc.nextDouble();

        double area = (1.732 * a * a) / 4;
        System.out.println("Area of equilateral triangle = " + area + " square units");
    }
}
