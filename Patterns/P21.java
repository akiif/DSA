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

*/

import java.util.Scanner;

public class P21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        printPattern2(num);

    }

    static void printPattern1(int num) {
        int c = 0;
        for (int i = 0; i < 2 * num; i++) {
            if(i >= num) {
                c--;
            } else {
                c++;
            }
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printPattern2(int num) {
        int c = 0;
        for (int row = 0; row < 2 * num; row++) {
            if(row >= num) {
                c = num - ( row - num );  //2n - row
            } else {
                c = row;
            }
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
