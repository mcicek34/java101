package conditions;

import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {

        System.out.println("Dogum ayınızı giriniz: ");
        Scanner scan = new Scanner(System.in);
        int mounth = scan.nextInt();

        System.out.println("Dogum gününzü giriniz: ");
        int day = scan.nextInt();

        if (mounth == 1) {
            if (day < 22) {
                System.out.println("Oğlak");
            } else
                System.out.println("Kova");

        }
        if (mounth == 2) {
            if (day <= 19) {
                System.out.println("Kova");
            } else
                System.out.println("Balık");

        }
        if (mounth == 3) {

            if (day <= 20) {
                System.out.println("Balık");
            } else
                System.out.println("Koç");

        }
        if (mounth == 4) {
            if (day <= 20) {
                System.out.println("Koç");
            } else
                System.out.println("Boğa");

        }
        if (mounth == 5) {
            if (day <= 21) {
                System.out.println("Boğa");
            } else
                System.out.println("İkizler");

        }
        if (mounth == 6) {
            if (day <= 22) {
                System.out.println("İkizler");
            } else
                System.out.println("Yengeç");

        }
        if (mounth == 7) {
            if (day <= 22) {
                System.out.println("Yengeç");
            } else
                System.out.println("Aslan");

        }
        if (mounth == 8) {
            if (day <= 22) {
                System.out.println("Aslan");
            } else
                System.out.println("Başak");

        }
        if (mounth == 9) {
            if (day <= 22) {
                System.out.println("Başak");
            } else
                System.out.println("Terazi");

        }
        if (mounth == 10) {
            if (day <= 22) {
                System.out.println("Terazi");
            } else
                System.out.println("Akrep");

        }
        if (mounth == 11) {
            if (day <= 21) {
                System.out.println("Akrep");
            } else
                System.out.println("Yay");

        }
        if (mounth == 12) {
            if (day <= 19) {
                System.out.println("Yay");
            } else
                System.out.println("Oğlak");

        }

    }
}
