package loops;

import java.util.Scanner;

public class FindCombination {
    public static void main(String[] args) {
        System.out.println("------------Find Combination");
        System.out.println("Kombinasyonu Hesaplanacak Değerleri Giriniz:");
        Scanner scan = new Scanner(System.in);
        //C(n,r) = n! / (r! * (n-r)!)

        int n = scan.nextInt();
        int r = scan.nextInt();
        int result;

        result = factorial(n) / (factorial(r) * factorial(n-r));
        System.out.println(result);
    }

    public static  int factorial(int fac){
        int total = 1;
        for (int i = 1; i <= fac; i++){
            total = total * i;
        }
        return total;
    }
}
