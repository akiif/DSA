package Patterns;

/*
https://youtu.be/lsOOs5J8ycw?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=1415

no. of rows = (num * 2) - 1

    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

Process finished with exit code 0


*/

import java.util.Scanner;

public class P22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        printPattern(num);

    }

    static void printPattern(int num) {
        int c = 0;
        int space = 0;
        for (int row = 0; row < 2 * num; row++) {
            int totalColsInRow = row > num ? 2 * num - row : row;
            int noOfSpaces = num - totalColsInRow;
            for (int i = 0; i < noOfSpaces; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
