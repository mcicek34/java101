package conditions;

import java.util.Scanner;

public class CalculatorSwitch {

    public static void main(String[] args) {
        System.out.println("------Hesap Makinesi---------");
        Scanner scan = new Scanner(System.in);

        System.out.println("İşlem yapılacak iki sayıyı giriniz");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        System.out.println("Yapılacak islemi giriniz: topla : 1 cikarma : 2 bolme : 3 carpma : 4");
        int value = scan.nextInt();

        switch (value){
            case 1:
                System.out.println(number1 + number2);
                break;

            case 2:
                System.out.println(number1 - number2);
                break;

            case 3:
                if (number1 == 0 || number2 == 0)
                System.out.println("Sayı 0 a bolunemez");
                else
                    System.out.println(number1 / number2);
                break;

            case 4:
                System.out.println(number1 * number2);
                break;
        }
    }
}
