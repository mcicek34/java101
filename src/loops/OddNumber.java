package loops;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        System.out.println("---------Odd Number-----------");
        Scanner scan = new Scanner(System.in);
        int number;
        int total = 0;

        do {
            System.out.print("Bir sayi giriniz: ");
            number = scan.nextInt();

            if (number % 4 == 0 || number % 2 == 0) {
                total += number;
            }

        } while (number % 2 == 0);

        System.out.println("Toplam : " + total);
    }
}
