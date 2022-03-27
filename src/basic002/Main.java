package basic002;

import java.util.Scanner;

/**
 * 피보나치 수열을 출력하시오
 *
 * An = A(n-1) + A(n-2)
 */
public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.print("피보나치 수열의 크기를 입력하세요: ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            logic(input);
        }
    }

    public static void logic(int input) {
        int[] fibo = new int[input];
        fibo[0] = 1;
        fibo[1] = 1;

        for(int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        for(int f : fibo) {
            System.out.print(f + " ");

        }
        System.out.println();
    }
}
