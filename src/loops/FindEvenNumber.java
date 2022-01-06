package loops;

import java.util.Scanner;

public class FindEvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int total = 0;
        int count = 0;
        int average;

        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                count++;
                total += i;
                System.out.println(i);
            }
        }
        average = total / count;

        System.out.println("Average: " + average);
    }
}
