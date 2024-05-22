package basic;

import java.util.Scanner;

// Area Of Isosceles Triangle
public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {

        System.out.println("========= \t AREA OF ISCOSCELES TRIANGLE \t=========");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of equal sides of the triangle: ");
        double a = sc.nextDouble();
        System.out.println("Enter the base of the triangle: ");
        double b = sc.nextDouble();

        double height = Math.sqrt((Math.pow(a, 2) - (Math.pow(b, 2)/4)));

        double area = 0.5 * b * height;
        System.out.println("Area of an Isosceles 1Triangle = " + area + " square units");
    }
}
