package conditions;

public class PrimeNumber {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {

            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int i) {
        int total = 0;

        if (i < 2) {
            return false;
        } else
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    total++;
                }
            }
        if (total == 2)
            return true;
        else
            return false;
    }
}
