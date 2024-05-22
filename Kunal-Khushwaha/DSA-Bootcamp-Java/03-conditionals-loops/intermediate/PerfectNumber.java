package intermediate;

import java.util.Scanner;

// Perfect Number: sum of its proper divisor (excluding the no. itself) equals the number
public class PerfectNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long p = isPerfect(n);

        if (p == n) {
            System.out.println(n + " is a perfect number");
        } else {
            System.out.println(n + " is not a perfect number");
        }
    }

    private static long isPerfect(long n) {

        long s = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        return s;
    }
}
