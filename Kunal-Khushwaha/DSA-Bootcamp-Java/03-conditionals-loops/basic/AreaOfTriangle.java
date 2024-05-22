package basic;

import java.util.Scanner;

// Area Of Triangle
public class AreaOfTriangle {
    public static void main(String[] args) {

        System.out.println("========= \t AREA OF TRIANGLE \t =========");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and height of the triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area + " square units");
    }
}
