package Patterns;

import java.util.Scanner;

/*
https://www.youtube.com/watch?v=o4lZ5M87m7o&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=45

*	*	*		*	*	*
*	*				*	*
*						*
*	*				*	*
*	*	*		*	*	*

*/

public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sp = n / 2 + 1; // sp = space initially
        int st = 1; //st = star initially
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++)
                System.out.print("*\t");
            for(int j = 1; j <= st; j++)
                System.out.print("\t");
            for (int j = 1; j <= sp; j++)
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
