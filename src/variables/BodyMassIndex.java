package variables;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz");
        Scanner scan = new Scanner(System.in);

        double size = scan.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz");
        double weight = scan.nextDouble();

        double index = (weight / size / size);
        System.out.println("Vücut Kitle İndeksiniz : "+index);
    }
}
