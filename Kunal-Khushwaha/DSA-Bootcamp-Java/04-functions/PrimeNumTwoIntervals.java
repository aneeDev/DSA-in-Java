// Write a funstion that returns all the prime numbers between two given numbers

import java.util.Scanner;

public class PrimeNumTwoIntervals {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int startRange = sc.nextInt();
        int endRange = sc.nextInt();

        primeNumbers(startRange, endRange);
    }

    static void primeNumbers(int a, int b) {

        boolean isPrime[] = PrimeOrNot.seiveOfEratoSthenes(b);

        System.out.println("List of Prime Numbers from " + a + " to " + b);
        for (int i = a; i <= b; i++) {
            if (isPrime[i] == true) {
                System.out.print(i + ", ");
            }
        }
    }
}
