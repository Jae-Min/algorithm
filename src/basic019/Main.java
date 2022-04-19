package basic019;

import java.util.Scanner;

/**
 * n의 m승 결과를 출력하시오
 * case) n=2 m=3
 * result) 8
 */

public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.print("n: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            System.out.print("m: ");
            int m = scanner.nextInt();
            logic(n, m);
        }
    }

    private static void logic(int n, int m) {
        int result = 1;
        for(int i = 0; i < m; i++) {
            result *= n;
        }
        System.out.println("result = " + result);
    }
}
