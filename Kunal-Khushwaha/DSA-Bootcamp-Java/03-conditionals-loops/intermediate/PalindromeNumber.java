package intermediate;

import java.util.Scanner;

// Palindrome number: A number which is equally read from both sides. Eg: 131
public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int r, s = 0, temp = n;

        while (n > 0) {
            r = n % 10;
            s = (s * 10) + r;
            n = n / 10;
        }

        if (temp == s) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");

        }
    }
}
