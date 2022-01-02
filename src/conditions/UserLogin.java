package conditions;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userName = "patika", password = "java101", name, pass;

        System.out.println("Kullanıcı Adınızı giriniz:");
        name = scan.nextLine();

        System.out.println("Şifrenizi giriniz:");
        pass = scan.nextLine();

        if (name.equals(userName) && pass.equals(password)) {
            System.out.println("Giriş Yapıldı");

        } else {
            System.out.println("Şifrenizi yanlış girdiniz sıfırlamak ister misiniz? evet -> 1 hayır -> 2");
            int value = scan.nextInt();
            boolean result = true;
            if (value == 1) {
                while (result){
                    System.out.println("Yeni sifrenizi giriniz:");
                    String newPassword = scan.next();

                    if (newPassword.equals(password)) {
                        System.out.println("Yeni şifre eskisiyle aynı olamaz. Lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturdu");
                        result = false;
                    }
                }

            }

        }

    }
}
