package conditions;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("Hava sıcaklığı giriniz");
        Scanner scan = new Scanner(System.in);
        double heat = scan.nextDouble();

        if (5 <= heat && heat <= 25) {
            if (heat < 15) {
                System.out.println("Sinemaya gidebilirsiniz");
            } else if (heat > 15) {
                System.out.println("Piknik yapabilirsiniz");
            }
        } else if (heat < 5)
            System.out.println("Kayak yapabilirsiniz");
        else
            System.out.println("Yüzmeye gidebilirsiniz");

    }
}
