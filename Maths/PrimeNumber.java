package Maths;

/*
A number which is only dividable by 1 and itself.
 */

public class PrimeNumber {

    public static void main(String[] args) {
        int num = 7;
        System.out.println(isPrime(num));

        int n = 20;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + isPrime2(i));
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static boolean isPrime2(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            /*
            c <= sqrt(n)  // By squaring both the sides:
            c * c <= n
             */
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
