package conditions;

import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {

        System.out.println("Ebob / Ekok hesaplama | Ebob için 1 Ekok için 2 ye basınız");
        Scanner scan = new Scanner(System.in);
        int chose = scan.nextInt();

        System.out.println("Hesaplanmasını istediğiniz 2 sayıyı giriniz:");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        switch (chose) {
            case 1:
                int ebob = ebobCalculater(number1, number2);
                System.out.println(ebob);
                break;
            case 2:
                ekokCalculater(number1, number2);
                break;
            default:
                System.out.println("Lütfen tam sayı giriniz");
        }

    }

    private static int ebobCalculater(int number1, int number2) {
        int i = 1, ebob = 0;
        while (i <= number1 && i <= number2) {
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        return ebob;
    }

    private static void ekokCalculater(int number1, int number2) {
        int ekok = (number1 * number2) / ebobCalculater(number1, number2);
        System.out.println(ekok);
    }
}
