package loops;

import java.util.Scanner;

public class StepValue {
    public static void main(String[] args) {
        System.out.println("Basamak degerlerinin toplamını istediğiniz sayıyı giriniz:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int temp;
        int total = 0;

        while (number != 0){
            total=(number%10)+total;
            number /= 10;
        }
        System.out.println(total);
    }

}
