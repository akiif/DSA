package Patterns;

/*
https://www.youtube.com/watch?v=lKhGlVXdD2c&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=64

		1
	2	3	2
3	4	5	4	3
	2	3	2
		1

*/

import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int outerSpace = num / 2;
        int star = 1;
        int val = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= outerSpace; j++) {
                System.out.print("\t");
            }
            int cval = val;
            for (int j = 1; j <= star; j++) {
                System.out.print(cval + "\t");
                if (j <= star / 2) {
                    cval++;
                } else {
                    cval--;
                }
            }
            if (i <= num / 2) {
                outerSpace--;
                star+=2;
                val++;
            } else {
                outerSpace++;
                star-=2;
                val--;
            }
            System.out.println();
        }
    }
}

