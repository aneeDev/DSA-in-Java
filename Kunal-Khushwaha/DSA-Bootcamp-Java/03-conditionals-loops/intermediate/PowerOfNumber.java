package intermediate;

import java.util.Scanner;

// Calculate power in Java
public class PowerOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = sc.nextInt();
        System.out.println("Enter the exponent: ");
        int exp = sc.nextInt();

        int cpy = exp;

        int result = 1;

        while (exp != 0) {
            result *= base;
            --exp;
        }

        System.out.println("Result of " + base + " to the power " + cpy + " is " + result);
    }
}
