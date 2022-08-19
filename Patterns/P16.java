package Patterns;

/*
https://www.youtube.com/watch?v=qtWOvVRMHuM&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=65
col = 2n - 1
row = n
1						1
1	2				2	1
1	2	3		3	2	1
1	2	3	4	3	2	1

*/

import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int space = 2 * num - 3;
        int col = 2 * num - 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (int j = i; j >= 1; j--) {
                if (j == num)
                    continue;
                System.out.print(j + "\t");
            }
            System.out.println();
            space -= 2;
        }
    }
}

