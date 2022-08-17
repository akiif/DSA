package Patterns;

/*
https://www.youtube.com/watch?v=Hf821tK1hIc&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=47

*	*	*	*	*
	*	*	*	*
		*	*	*
			*	*
				*

*/

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = n; i >= 1; i--) {
            int diff = n - i;
            for (int j = 1; j <= n; j++) {
                if(j <= diff)
                    System.out.print("\t");
                else
                    System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
