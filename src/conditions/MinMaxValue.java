package conditions;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxValue {

    public static void main(String[] args) {

        System.out.println("Kaç sayı gireceksiniz:");
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        int[] values = new int[value];

        for (int i = 0; i < value; i++) {
            System.out.print("Bir sayı giriniz:");
            values[i] = scan.nextInt();
        }
        Arrays.sort(values);

        System.out.println("Max Value : " + values[value - 1]);
        System.out.println("Min Value : " + values[0]);

    }
}
