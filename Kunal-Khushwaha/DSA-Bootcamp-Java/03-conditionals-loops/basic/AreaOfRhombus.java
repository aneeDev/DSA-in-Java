package basic;

import java.util.Scanner;

// Area Of Rhombus
public class AreaOfRhombus {
    public static void main(String[] args) {

        System.out.println("========= \t AREA OF RHOMBUS \t =========");

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Using Diagonals \n 2. Using Base and Height \n 3. Using Trigonometry");
        System.out.println("Choose a method from above: ");
        int n = sc.nextInt();

        double area = 0.0;

        switch (n) {

            case 1:
                System.out.println("-------Using Diagonals----------");
                System.out.println("Enter the diagonals of rhombus: ");
                double d1 = sc.nextDouble();
                double d2 = sc.nextDouble();
                area = 0.5 * d1 * d2;
                System.out.println("Area of Rhombus = " + area + " square units");
                break;
            case 2:
                System.out.println("--------Using Base and Height--------");
                System.out.println("Enter the base and height of the rhombus: ");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                area = base * height;
                System.out.println("Area of Rhombus = " + area + " square units");
                break;
            case 3:
                System.out.println("--------Using Trigonometry--------");
                System.out.println("Enter the side length and  length of interior angle of the rhombus: ");
                double l = sc.nextDouble();
                double a = sc.nextDouble();
                area = Math.pow(l, 2) * Math.sin(a);
                System.out.println("Area of Rhombus = " + area + " square units");
                break;
            default:
                System.out.println("=======ERROR: Invalid Input =========");
        }

    }
}
