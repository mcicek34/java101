package conditions;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.print("Eleman sayısı giriniz: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int number1 = 0, number2 = 1;

        for (int i = 1; i < number + 2; i++) {
            System.out.print(number1 + " ");

            int number3 = number2 + number1;
            number1 = number2;
            number2 = number3;
        }
    }
}
