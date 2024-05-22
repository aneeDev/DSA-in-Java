package intermediate;

import java.util.Scanner;

// Armstrong Number: a number which is equal to the sum of its digits raised to the power of number of digits
// Eg : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int cpy = n;
        int r = 0, s = 0;
        int count = countDigits(n);
        while(n != 0) {
           r = n % 10;
           s += (int) Math.pow(r, count);
           n = n / 10;
        }

        if (cpy == s)
            System.out.println(cpy + " is an Armstrong number");
        else
            System.out.println(cpy + " is not an Armstrong number");
    }

    private static int countDigits(int num) {

        int r = 0, c = 0;
        while (num != 0) {
            r = num % 10;
            c++;
            num = num / 10;
        }
        return c;
    }
}
