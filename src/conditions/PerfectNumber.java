package conditions;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println("Bir sayi giriniz: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println(number + "  mükemmel sayidir");
        } else
            System.out.println(number + "  Mükemmel sayı değildir.");

    }
}
