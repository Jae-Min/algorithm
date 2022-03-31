package basic008;

import java.util.Scanner;

/**
 * 입력한 수의 팩토리얼을 구하시오.
 */
public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.print("수를 입력하세요: ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            logic(input);
        }
    }

    public static void logic(int input) {
        int fac = 1;
        while(input > 0) {
            fac *= input;
            input--;
        }

        System.out.println("result: " + fac);
    }
}
