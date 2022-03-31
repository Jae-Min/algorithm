package basic009;

import java.util.Scanner;

/**
 * 각 자릿수 합 구하기
 */
public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.print("수를 입력해주세요: ");
            Scanner scanner = new Scanner(System.in);
            logic(scanner.nextInt());
        }
    }

    public static void logic(int number) {
        int sum = 0;
        while(number > 0) {
            sum += (number % 10);
            number /= 10;
        }
        System.out.println("result = " + sum);
    }
}
