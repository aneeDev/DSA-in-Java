// Define a method to find out if a number is prime or not
// Algorithm: Sieve of Eratosthenes

import java.util.Arrays;
import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime[] = seiveOfEratoSthenes(n);
//        for (int i = 0; i <= n; i++) {
//            System.out.println(i + " " + isPrime[i]) ;
//        }

        if (isPrime[n] == true)
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is not a Prime number");
    }

    static boolean[] seiveOfEratoSthenes(int n) {

        boolean isPrime[] = new boolean[n+1];

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            for (int j = 2*i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }

        return isPrime;
    }
}
