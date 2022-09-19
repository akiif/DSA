package Maths;

/*
Q: Print all the prime numbers <= n

Time Complexity: O (N * log(log(N)))
 */

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        int n = 41;
        boolean[] primes = new boolean[n + 1]; // will be initialized as false.

        sieveOfEratosthenes(n, primes);


    }

    // false in array means number is prime
    static void sieveOfEratosthenes (int n, boolean[] primes) {

        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {  // If the primes is false
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + "  ");
            }
        }
    }
}
