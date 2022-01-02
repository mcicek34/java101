package conditions;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distance, age, tripType;
        double amount1, amount2, amount3, price = 0.1;
        boolean result = true;

        while (result) {

            System.out.print("Lutfen yolculuk mesafenizi giriniz: ");
            distance = scan.nextInt();

            System.out.print("Lütfen Yaşınızı Giriniz: ");
            age = scan.nextInt();

            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
            tripType = scan.nextInt();

            if (distance > 0 && age > 0 && (tripType == 1 || tripType == 2)) {
                result = false;
            } else
                System.out.println("Hatalı veri girdiniz");

            amount1 = (distance * price) - (distance * price) * 0.5;
            amount2 = (distance * price) - (distance * price) * 0.1;
            amount3 = (distance * price) - (distance * price) * 0.3;

            switch (tripType) {
                case 1:
                    if (age < 12) {
                        System.out.println("Toplam Tutar: " + amount1 + " TL");
                    } else if (age <= 24) {
                        System.out.println("Toplam Tutar: " + amount2 + " TL");
                    } else if (65 <= age) {
                        System.out.println("Toplam Tutar: " + amount3 + " TL");
                    }

                case 2:
                    if (age < 12) {
                        System.out.println("Toplam Tutar: " + (amount1 - (amount1 * 0.2)) * 2 + " TL");
                    } else if (age <= 24) {
                        System.out.println("Toplam Tutar: " + (amount2 - (amount2 * 0.2)) * 2 + " TL");
                    } else if (65 <= age) {
                        System.out.println("Toplam Tutar: " + (amount3 - (amount3 * 0.2)) * 2 + " TL");
                    }
            }

        }

    }
}
