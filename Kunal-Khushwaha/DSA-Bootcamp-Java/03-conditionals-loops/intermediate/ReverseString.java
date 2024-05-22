package intermediate;

import java.util.Scanner;

// Reverse a string
public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.next();

        String reversedStr="";
        char ch;
        System.out.println("Original Word: " + str);

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            reversedStr = ch + reversedStr;
        }

        System.out.println("Reversed String: " + reversedStr);
    }
}
