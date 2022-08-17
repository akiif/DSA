package Patterns;

/*
https://www.youtube.com/watch?v=hGWoXqF1qC8&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=44

		*
	*	*	*
*	*	*	*	*
	*	*	*
		*

*/

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sp = n / 2; // sp = space initially
        int st = 1; //st = star initially
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++)
                System.out.print("\t");
            for(int j = 1; j <= st; j++)
                System.out.print("*\t");
            System.out.println("");

            if (i <= n / 2) {
                sp--;
                st += 2;
            } else  {          //if(i > n / 2)
                sp++;
                st -= 2;
            }
        }
    }
}
