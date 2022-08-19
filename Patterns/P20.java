package Patterns;

/*
https://www.youtube.com/watch?v=9KlKv54QI9c&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=71

For the downward /\ part consider it as two diagonals

*				*
*				*
*		*		*
*	*		*	*
*				*

*/

import java.util.Scanner;

public class P20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if ((j == 1) || (j == num)) {
                    System.out.print("*\t");
                } else if (i > num / 2 && (i == j || i + j == num + 1)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

