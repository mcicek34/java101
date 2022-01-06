package conditions;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        System.out.println("----------Chinese Zodiac---------");
        System.out.println("Please! Enter  Your Date of Birth");
        Scanner scan = new Scanner(System.in);

        int day = scan.nextInt();
        String[] animals = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        int result = day % 12;
        System.out.println(animals[result]);
    }
}
