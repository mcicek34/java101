package conditions;

import java.util.Scanner;

public class InvertedTriangle {

    public static void main(String[] args) {
        System.out.print("Basamak sayısı giriniz: ");
        Scanner scan = new Scanner(System.in);
        int stepNumber = scan.nextInt();

        for (int i=0; i<stepNumber; i++) {
            for (int j=0; j<i + 1; j++) {
                System.out.print(" ");
            }

            for (int k=0; k<2*(stepNumber - i) - 1; k++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
