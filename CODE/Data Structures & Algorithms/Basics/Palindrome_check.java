// Simple program in java to check whether the input number is a palindrome or not

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(int n) {

        String num = String.valueOf(n); // Integer to string
        String reversed = num;

        reversed = new StringBuilder(reversed).reverse().toString(); // Reversing the number (in string form)

        return num.equals(reversed);
    }

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be checked: ");
        n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("Is " + n + " a Palindrome number? : " + "Yes");
        } else {
            System.out.println("Is " + n + " a Palindrome number? : " + "NO");
        }
    }
}
