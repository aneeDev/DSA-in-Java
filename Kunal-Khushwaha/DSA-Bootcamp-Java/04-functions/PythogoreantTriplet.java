// PythogoreanTriplet: when the sum of the squares of two numbers = the square of the third number

import java.util.Scanner;

// Write a function to check if a given triplet is a Pythogorean Triplet or not
public class PythogoreantTriplet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean flag = isPythogoreanTriplet(a, b, c);

        if (flag == true) {
            System.out.println("Pythogorean Triplet");
        } else {
            System.out.println("Not a Pythogorean Triplet");
        }

    }

    private static boolean isPythogoreanTriplet(int x, int y, int z) {
        int max = x;

        if(y > max) {
            max = y;
            int hyp = (x*x) + (z*z);
            int hypo = (y*y);

            if (hyp == hypo)
                return true;
        }

        if(z > max) {
            max = z;
            int hyp = (x*x) + (y*y);
            int hypo = (z*z);

            if (hyp == hypo)
                return true;
        }

        int hyp = (z*z) + (y*y);
        int hypo = (x*x);

        if (hyp == hypo)
            return true;

        return false;
    }

}
