package Patterns;

/*
https://youtu.be/lsOOs5J8ycw?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=2637

4 4 4 4 4 4 4 4
4 3 3 3 3 3 3 4
4 3 2 2 2 2 3 4
4 3 2 1 1 2 3 4
4 3 2 1 1 2 3 4
4 3 2 2 2 2 3 4
4 3 3 3 3 3 3 4
4 4 4 4 4 4 4 4

*/

import java.util.Scanner;

public class P26 {

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
                int atEveryIndex = num - Math.min(Math.min(up, down), Math.min(left, right)) ;
                System.out.print(atEveryIndex + " ");
            }

            System.out.println();
        }
    }

}
