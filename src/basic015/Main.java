package basic015;


import java.util.Scanner;

/**
 * 구구단 a부터 b단까지 입력받아 아래와 같이 출력하시오
 * case) 2 3
 * result)
 * 2 * 1 = 2   3 * 1 = 3
 * 2 * 2 = 4   3 * 2 = 6
 * .
 * .
 * 2 * 9 = 18  3 * 9 = 27
 */

public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.print("구구단 시작 단: ");
            Scanner scanner = new Scanner(System.in);
            int start = scanner.nextInt();
            System.out.print("구구단 마지막 단: ");
            int end = scanner.nextInt();

            logic(start, end);
        }
    }

    private static void logic(int a, int b) {
        System.out.println("result)");
        for(int i = 1; i <= 9; i++) {
            for(int j = a; j <= b; j++) {
                System.out.printf("%3d * %d = %2d", j, i, j * i);
            }
            System.out.println();
        }
    }
}