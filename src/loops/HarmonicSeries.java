package loops;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        System.out.println("Harmonik Serisi Hesaplanacak Bir Sayı Giriniz:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        double total = 0.0;

        for (double i = 1; i<=number; i++){
            total += (1/i);
        }

        System.out.println(total);
    }
}
