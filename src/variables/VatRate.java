package variables;

import java.util.Scanner;

public class VatRate {
    public static void main(String[] args) {
        System.out.println("KDV si hesaplanacak tutarı giriniz");
        Scanner scan = new Scanner(System.in);

        double amount = scan.nextDouble();
        double rateVate = 0.18;
        double rateVate2 = 0.08;

        System.out.println(amount<=0 ? "Tutar 0 dan küçük olamaz": (amount > 0 && amount <=1000 ? amount * rateVate : amount * rateVate2));
    }
}
