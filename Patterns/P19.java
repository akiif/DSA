package Patterns;

/*
https://www.youtube.com/watch?v=9KlKv54QI9c&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=71

*	*	*		*
		*		*
*	*	*	*	*
*		*
*		*	*	*

*/

import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (
                    (j == num / 2 + 1) || (i == num / 2 + 1) || (i == 1 && j <= num / 2 ) ||
                    (i == num && j > num / 2) || ((i >= num / 2 + 1) && j == 1) ||
                    (i <= num / 2 && j == num)
                ) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

