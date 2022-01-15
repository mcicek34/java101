package loops;

import java.util.Scanner;

public class DrawStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Basamak Giriniz: ");
        int number = scan.nextInt();

        for(int i = 0; i<number; i++){
            for(int j = 0; j<number - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<(2 * i + 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i<number; i++){
            for(int k = 0; k<(i + 1); k++){
                System.out.print(" ");
            }
            for(int j = 1; j< 2 * (number - i); j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
