package basic;

import java.util.Scanner;

// Subtract the product and sum of digits of an integer
// [https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/]
public class ProdSumOfDigitsLeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

        int cpy = n;

        int p = 1;
        int s = 0;
        int r = 0;

        while (n > 0) {
            r = n % 10;
            s = s + r;
            p = p * r;
            n = n / 10;
        }

        System.out.println("Result: " + (p-s));
    }
}
