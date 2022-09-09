package Patterns;

/*
https://youtu.be/lsOOs5J8ycw?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=2637

0 0 0 0 0 0 0 0 0
0 1 1 1 1 1 1 1 0
0 1 2 2 2 2 2 1 0
0 1 2 3 3 3 2 1 0
0 1 2 3 4 3 2 1 0
0 1 2 3 3 3 2 1 0
0 1 2 2 2 2 2 1 0
0 1 1 1 1 1 1 1 0
0 0 0 0 0 0 0 0 0

*/

import java.util.Scanner;

public class P25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        printPattern(num);

    }

    static void printPattern(int num) {
        int n = (2 * num) ;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int up = row;
                int down = n - row;
                int left = col;
                int right = n - col;
                int atEveryIndex = Math.min(Math.min(up, down), Math.min(left, right));
                System.out.print(atEveryIndex + " ");
            }

            System.out.println();
        }
    }

}
