package Patterns;

/*
https://www.youtube.com/watch?v=8ccsrxrXCmk&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=55

Hallow Diamond
		*
	*		*
*				*
	*		*
		*


*/

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int innerSpace = -1;
        int outerSpace = n / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= outerSpace; j++)
                System.out.print("\t");
            System.out.print("*\t");
            for (int j = 1; j <= innerSpace; j++)
                System.out.print("\t");
            if (i!=1 && i!=n)
                System.out.print("*\t");
            if (i <= n / 2) {
                outerSpace -= 1;
                innerSpace += 2;
            } else {
                outerSpace += 1;
                innerSpace -= 2;
            }
            System.out.println();
        }
    }
}
