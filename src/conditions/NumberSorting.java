package conditions;

import java.util.Scanner;

public class NumberSorting {
    public static void main(String[] args) {
        System.out.println("Sıralanmasını istediğiniz sayıları giriniz: ");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();

        if (number1 < number2 && number1 < number3) {
            if (number2 < number3) {
                System.out.println(number1 + " " + number2 + " " + number3);
            } else if (number3 < number2) {
                System.out.println(number1 + " " + number3 + " " + number2);
            }
        }
        if (number2 < number1 && number2 < number3) {
            if (number1 < number3) {
                System.out.println(number2 + " " + number1 + " " + number3);
            } else if (number3 < number1) {
                System.out.println(number2 + " " + number3 + " " + number1);
            }
        }
        if (number3 < number1 && number3 < number2) {
            if (number1 < number2) {
                System.out.println(number3 + " " + number1 + " " + number2);
            } else if (number2 < number1) {
                System.out.println(number3 + " " + number2 + " " + number1);
            }
        }

    }
}
