package variables;

import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {
        System.out.println("-----Manav Kasa Programı---------");
        Scanner scan = new Scanner(System.in);

        double pear = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double eggplant = 5.0;

        System.out.print("Armut kaç kilo ");
        double pearKg = scan.nextDouble();

        System.out.print("Elma kaç kilo ");
        double appleKg = scan.nextDouble();

        System.out.print("Domates kaç kilo ");
        double tomatoKg = scan.nextDouble();

        System.out.print("Muz kaç kilo ");
        double bananaKg = scan.nextDouble();

        System.out.print("Patlıcan kaç kilo ");
        double eggplantKg = scan.nextDouble();

        System.out.println("Toplam Tutar: " + (pear * pearKg + apple * appleKg + tomato * tomatoKg + banana * bananaKg + eggplant * eggplantKg) );
    }
}
