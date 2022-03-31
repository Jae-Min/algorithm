package basic011;

import java.util.Scanner;

/**
 * 입력된 수(N)만큼 N행 N열의 형태의 연속된 숫자 사각형을 출력하시오.
 * case)   N = 4
 * result) 1  2   3   4
 *         8  7   6   5
 *         9  10  11  12
 *         16 15  14  13
 */
public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.print("수를 입력하세요: ");
            Scanner scanner = new Scanner(System.in);
            logic(scanner.nextInt());
        }

    }

    private static void logic(int n) {
        System.out.println("result)");
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                for(int k = 0; k < n; k++) {
                    arr[i][k] = i * n + k + 1;
                }
            } else {
                for(int k = 0; k < n; k++) {
                    arr[i][k] = i * n + n - k;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int k = 0; k < n; k++) {
                System.out.printf("%4d", arr[i][k]);
            }
            System.out.println();
        }
    }
}
