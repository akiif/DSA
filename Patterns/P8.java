package Patterns;

/*
https://www.youtube.com/watch?v=f5DrvVWSDgY&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=49

                        i+j = n+1
1    -	-	-	-	*
2    -	-	-	*   -
3    -	-	*   -   -
4    -	*   -   -   -
5    *  -   -   -   -
     1  2   3   4   5

*/
/*
https://www.youtube.com/watch?v=f5DrvVWSDgY&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=49

				*
			*
		*
	*
*

*/

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                if (i + j == n + 1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
                System.out.println();
        }
    }
/*          Approach - 2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sp = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++)
                System.out.print("\t");
            sp--;
            System.out.println("*");
        }
    }

 */
}
