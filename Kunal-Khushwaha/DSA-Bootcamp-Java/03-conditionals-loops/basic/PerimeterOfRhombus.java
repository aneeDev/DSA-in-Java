package basic;

import java.util.Scanner;

// Perimeter Of Rhombus
public class PerimeterOfRhombus {
    public static void main(String[] args) {

        System.out.println("========= \t PERIMETER OF RHOMBUS \t =========");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of rhombus: ");
        double a =  sc.nextDouble();

        double p = 4 * a;
        System.out.println("Perimeter of Rhombus = " + p);

    }
}
