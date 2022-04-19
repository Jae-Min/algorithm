package basic018;

import java.util.Scanner;

/**
 * 입력한 값에 따른 *을 출력하시오.
 * case) 3
 * result)
 *   *
 *  **
 * ***
 */

public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.print("입력값: ");
            Scanner scanner = new Scanner(System.in);
            logic(scanner.nextInt());
        }
    }

    private static void logic(int n) {
        System.out.println("result)");
        for(int i = 0; i < n; i++) {
            for(int j = n-1; j >= 0; j--) {
                if(j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
