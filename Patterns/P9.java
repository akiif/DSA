package Patterns;

/*
https://www.youtube.com/watch?v=Ul2CgihEzp0&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=52

*				*
	*		*
		*
	*		*
*				*

*/

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                if (i + j == n + 1 || i == j)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            System.out.println();
        }
    }

}
