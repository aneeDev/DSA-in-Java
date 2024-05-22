package basic;

import java.util.Scanner;

// Perimeter Of Rectangle
public class PerimeterOfRectangle {
    public static void main(String[] args) {

        System.out.println("========= \t PERIMETER OF Rectangle \t =========");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        double p = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle = " + p);
    }
}
