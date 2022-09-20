package Maths;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int num = 20;
        factor1(num);
        System.out.println();
        factor2(num);
        System.out.println();
        factor3(num);
    }


    // Brute Force Approach - 1
    // O(n)
    static void factor1 (int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Brute Force Approach - 1
    // O(sqrt(n))
    static void factor2 (int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {   // In case of n = 36, 36 / 6 = 6, hence 6 will be printed twice
                    System.out.println(i + " ");
                } else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }

    // Printing in sorted order
    // Both time and space complexities will be O(sqrt(n))
    static void factor3 (int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {   // In case of n = 36, 36 / 6 = 6, hence 6 will be printed twice
                    System.out.println(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);    // or list.add(0, n / i)
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        /*
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
         */
    }

}
