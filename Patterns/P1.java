package Patterns;

/*
https://www.youtube.com/watch?v=3OUOKD-wj0Q
 *
 * *
 * * *
 * * * *
 * * * * *

*/

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
