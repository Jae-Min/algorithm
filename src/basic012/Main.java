package basic012;

import java.util.Scanner;

/**
 * 입력된 수(N)만큼 N행 N열의 형태의 연속된 숫자 사각형을 출력하시오.
 * case)   N = 4
 * result) 1  5  9   13
 *         2  6  10  14
 *         3  7  11  15
 *         4  8  12  16
 */
public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.print("수를 입력하세요: ");
            Scanner scanner = new Scanner(System.in);
            logic(scanner.nextInt());
        }
    }

    private static void logic(int size) {
        System.out.println("result)");
        for(int i = 0; i < size; i++) {
            for(int k = 0; k < size; k++) {
                System.out.printf("%4d", (i + 1) + k * size);
            }
            System.out.println();
        }
    }
}
