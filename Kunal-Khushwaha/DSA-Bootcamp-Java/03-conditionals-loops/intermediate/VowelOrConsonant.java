package intermediate;

import java.util.Scanner;

// Vowel or Consonant
public class VowelOrConsonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O'|| ch == 'o' || ch == 'U' || ch == 'u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
