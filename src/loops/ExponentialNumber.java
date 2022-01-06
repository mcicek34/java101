package loops;

import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args) {
        System.out.println("---------exponential number------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int number = scan.nextInt();

        for (int i = 1; i < number; i *= 4) {
            System.out.println(i);
        }

        for (int j = 1; j < number; j *= 5) {
            System.out.println(j);
        }
    }
}
