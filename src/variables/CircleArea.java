package variables;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        System.out.println("Alanı hesaplanacak daire diliminin yarı çapı ve açı olcusunu giriniz");
        Scanner scan = new Scanner(System.in);

        int radius = scan.nextInt();
        double angle = scan.nextDouble();
        final double PI = 3.14;

        double area = (PI * Math.pow(radius,2) * angle) / 360;
        System.out.println(area);
    }
}
