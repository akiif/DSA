package Patterns;

/*
https://www.youtube.com/watch?v=y-b-8ddRFR4&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=70

*	*	*	*	*	*	*
	*				*
		*		*
			*
		*	*	*
	*	*	*	*	*
*	*	*	*	*	*	*

*/

import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int space = 0;
        int star = num;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= star; j++) {
                if (i > 1 && i <= num / 2 && j > 1 && j < star) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            if (i <= num / 2) {
                space++;
                star -= 2;
            } else {
                space--;
                star += 2;
            }
            System.out.println();
        }
    }
}

