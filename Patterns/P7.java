package Patterns;

/*
https://www.youtube.com/watch?v=ewBilX1an5A&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=48

*
	*
		*
			*
				*

*/

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++)
                System.out.print("\t");
            sp++;
            System.out.println("*");
        }
    }
}
