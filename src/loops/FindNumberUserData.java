package loops;

import java.util.Scanner;

public class FindNumberUserData {

    public static void main(String[] args) {

        System.out.println("Hesaplamak istediğiniz değerleri giriniz: ");
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int up = scan.nextInt();
        int total = 1;

        for (int i = 1; i <= up; i++) {
             total = total * number;
        }
        System.out.println(total);
    }
}
