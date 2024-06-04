// Define a program to find whether a number is even or odd

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int flag = isEvenOrOdd(a);

        if (flag == 1)
            System.out.println(a + " is an Even number");
        else
            System.out.println(a + " is a Odd number");

    }

    private static int isEvenOrOdd(int n) {

        if (n % 2 == 0)
            return 1;
        return 0;
    }
}
