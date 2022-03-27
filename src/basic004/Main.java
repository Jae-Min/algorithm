package basic004;

import java.util.Scanner;

/**
 * 십진수를 이진수로 바꾸시오
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

    public static void logic(int number) {
        int[] bin = new int[number];
        int i = 0;
        while(number > 0) {
            bin[i] = number % 2;
            number /= 2;
            i++;
        }
        i--;
        while(i >= 0) {
            System.out.print(bin[i]);
            i--;
        }

        System.out.println();
    }
}
