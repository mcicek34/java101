package methods;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        System.out.println("Bir sayı giriniz: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println(isPalindrome(number));
    }

    private static boolean isPalindrome(int number) {

        int temp = number, reverse = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverse = (reverse * 10) + lastNumber;
            temp /= 10;
        }

        return reverse == number;
    }
}
