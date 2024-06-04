// A person is eligible to vote if his/her age is  greater than or equal to 18. Define a method to find out if  he/she is eligible to vote.

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of the person: ");
        int age = sc.nextInt();

        isEligible(age);
    }

    static void isEligible(int a) {
        if (a >= 18)
            System.out.println("Eligible to Vote");
        else
            System.out.println("Not eligible to Vote");
    }
}
