package Patterns;

/*
https://www.youtube.com/watch?v=kmqISkLQlMI&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=67

		*
		*	*
*	*	*	*	*
		*	*
		*

*/

import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int space = num / 2;
        int star = 1;
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num; j++) {
                if (i == num / 2 + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*\t");
            }
            if (i <= num / 2) {
                star++;
            } else {
                star--;
            }
            System.out.println();
        }
    }
}

