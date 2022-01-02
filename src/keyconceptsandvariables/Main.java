package keyconceptsandvariables;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("------Not Ortalaması Programı-------");
        Scanner scan = new Scanner(System.in);

        double average = 0.0;
        String result;

        System.out.println("Matematik Notunuzu Giriniz");
        int mathNote = scan.nextInt();

        System.out.println("Kimya Notunuzu Giriniz");
        int chemNote = scan.nextInt();

        System.out.println("Turkce Notunuzu Giriniz");
        int turkNote = scan.nextInt();

        System.out.println("Tarih Notunuzu Giriniz");
        int historyNote = scan.nextInt();

        System.out.println("Muzik Notunuzu Giriniz");
        int musicNote = scan.nextInt();

        average = (mathNote + chemNote + turkNote + historyNote + musicNote) / 5;
        result = average > 60 ? "Gectiniz" : "Kaldınız";

        System.out.println(average + " " + result);

    }
}
