package methods;

import java.util.Scanner;

public class ExponentialNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Taban değeri giriniz: ");
        int base = scan.nextInt();

        System.out.println("Üs değeri giriniz: ");
        int upperNumber = scan.nextInt();

        System.out.println("Result : " + exponential(base, upperNumber));
    }

    public static int exponential(int base, int upperNumber) {

        if (upperNumber == 0)
            return 1;

        else if (base == 1)
            return 1;

        else return base * exponential(base, upperNumber - 1);
    }

}
