package variables;

import java.util.Scanner;

public class TriangularArea {

    public static void main(String[] args) {
        System.out.println("Alanı hesaplanacak üçgenin kenarlarını giriniz");
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        double environment, u;

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        environment = a + b + c;
        u = environment / 2;
        double area = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println(area);
    }
}
